package com.example.aop;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    // 更精确的切入点定义（建议保持原状）
    @Pointcut("execution(* com.example.service.impl.UserServiceImpl.*(..))")
    public void servicePointcut() {}

    @Around("servicePointcut()")
    public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 获取方法名称和操作类型
        String methodName = joinPoint.getSignature().getName();
        String operationType = "其他操作";

        // 根据方法名判断操作类型
        if (methodName.equals("login")) {
            operationType = "登录";
        } else if (methodName.equals("register")) {
            operationType = "注册";
        }

        // 记录开始日志
        System.out.println(operationType + "请求开始：" + methodName);
        long startTime = System.currentTimeMillis();

        try {
            Object result = joinPoint.proceed();
            long costTime = System.currentTimeMillis() - startTime;

            // 成功日志
            System.out.printf("%s成功！耗时：%dms | 结果：%s%n",
                    operationType, costTime, result != null ? result.toString() : "无返回");
            return result;
        } catch (Exception e) {
            // 异常日志
            long costTime = System.currentTimeMillis() - startTime;
            System.err.printf("%s失败：%s | 耗时：%dms%n",
                    operationType, e.getMessage(), costTime);
            throw e;
        }
    }
}