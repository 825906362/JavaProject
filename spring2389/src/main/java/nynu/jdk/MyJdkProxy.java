package nynu.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*jdk代理要求->要增强的类对象，必须有接口*/
public class MyJdkProxy implements InvocationHandler {
    ProductService productService;
    Object object;
    //创建一个代理对象
    public Object create(Object object) {
        this.object=object;
        this.productService=productService;
        /*类加载器，要增强的目标类中所有的接口，实现了InvocationHandler类的对象*/
        return Proxy.newProxyInstance(MyJdkProxy.class.getClassLoader(),
                object.getClass().getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect=new MyAspect();
        /*织入：调用原本方法之前调用增强方法*/
        myAspect.log();
        myAspect.check();
        Object obj=method.invoke(object,args);//productService.insert()
        myAspect.close();
        return obj;
    }
}
