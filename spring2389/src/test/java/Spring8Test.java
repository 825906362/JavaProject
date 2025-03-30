import nynu.cglib.MyCglibProxy;
import nynu.cglib.TeacherService;
import nynu.cglib.TeacherServiceImpl;
import nynu.controller.StudentController;
import nynu.controller.UserController;
import nynu.jdk.MyJdkProxy;
import nynu.jdk.ProductService;
import nynu.jdk.ProductServiceImpl;
import nynu.pojo.Student;
import nynu.xmlaop.BookService;
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
//    @Test
//    public void f3(){
//        TeacherService service=new TeacherServiceImpl();
//        //productService.insert();
//        MyJdkProxy proxy=new MyJdkProxy();
//        TeacherService service2=proxy.create(service);
//        service2.insert();
//        service2.delete();
//    }

    /*@Test
    public void f4(){
        TeacherService service=new TeacherServiceImpl();
        MyCglibProxy proxy=new MyCglibProxy();
        TeacherService service2=(TeacherService) proxy.create(service);
        service2.insert();
        service2.delete();
    }*/

    @Test
    public void f6(){
        ApplicationContext.ac=new ClassPathXmlApplicationContext("ac8.xml");
        BookService bookService=ac.getBean("BookService");
        bookService.aroud();
    }
}
