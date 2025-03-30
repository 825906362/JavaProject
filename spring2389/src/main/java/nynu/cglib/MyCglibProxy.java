package nynu.cglib;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*jdk代理要求->要增强的类对象，必须有接口*/
public class MyCglibProxy implements MethodInterceptor {
    public Object create(Object target){
        //创建能生成代理对象的类
        Enhancer enhancer=new Enhancer();
        //设置
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }



    @Override
    public Object intercept(Object proxy, Object[] args, MethodProxy methodProxy) throws Throwable {
        MyAspect myAspect=new MyAspect();
        //织入：调用原本方法之前调用增强方法
        myAspect.log();
        myAspect.check();
        Object obj= methodProxy.invokeSuper(proxy,args);        //productService.insert()
        myAspect.close();
        return obj;
    }
}
