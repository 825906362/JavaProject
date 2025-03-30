package nynu.xmlaop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*切面类*/
public class MyAspect {
    /*增强方法*/
    public void log(){
        System.out.println("日志处理");
        Logger logger= Logger.getLogger("");
        logger.info("正在进行---日志处理");
    }
    /*增强方法*/
    public void check(JoinPoint joinPoint){
        System.out.println("用户检查"+joinPoint.getSignature().getName());
    }
    /*增强方法*/
    public void close(){
        System.out.println("关闭操作");
    }
    public void aroud(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前置方法");
        joinPoint.proceed();//执行原本方法
        System.out.println("用户检查");
    }
}
