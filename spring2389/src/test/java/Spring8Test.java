import nynu.controller.StudentController;
import nynu.controller.UserController;
import nynu.jdk.MyJdkProxy;
import nynu.jdk.ProductService;
import nynu.jdk.ProductServiceImpl;
import nynu.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring8Test {
    @Test
    public void f1(){
        ProductServiceImpl productService=new ProductServiceImpl();
        productService.insert();
    }
    @Test
    public void f2(){
        ProductService productService=new ProductServiceImpl();
        //productService.insert();
        MyJdkProxy proxy=new MyJdkProxy();
        ProductService productService2=(ProductService) proxy.create(productService);
        productService2.insert();
        productService2.delete();
    }

}
