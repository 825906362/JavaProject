package nynu.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*jdk代理要求->要增强的类对象，必须有接口*/
public class MyJdkProxy implements InvocationHandler {
    ProductService productService;
<<<<<<< HEAD
    Object object;
    //创建一个代理对象
    public Object create(Object object) {
        this.object=object;
        this.productService=productService;
        /*类加载器，要增强的目标类中所有的接口，实现了InvocationHandler类的对象*/
        return Proxy.newProxyInstance(MyJdkProxy.class.getClassLoader(),
                object.getClass().getInterfaces(),this);
=======
    //创建一个代理对象
    public Object create(ProductService productService) {
        this.productService=productService;
        /*类加载器，要增强的目标类中所有的接口，实现了InvocationHandler类的对象*/
        return Proxy.newProxyInstance(MyJdkProxy.class.getClassLoader(),
                ProductServiceImpl.class.getInterfaces(),this);
>>>>>>> d2d5caf (笔记本上更新了上课内容)
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect=new MyAspect();
        /*织入：调用原本方法之前调用增强方法*/
        myAspect.log();
        myAspect.check();
<<<<<<< HEAD
        Object obj=method.invoke(object,args);//productService.insert()
=======
        Object obj=method.invoke(productService,args);//productService.insert()
>>>>>>> d2d5caf (笔记本上更新了上课内容)
        myAspect.close();
        return obj;
    }
}
