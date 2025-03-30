import nynu.controller.StudentController;
import nynu.controller.UserController;
import nynu.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring72Test {
    @Test
    public void f1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac4.xml");
    }
    @Test
    public void f2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac5.xml");
        StudentController studentController=(StudentController) ac.getBean("studentController");
        studentController.studentAdd();
    }
    @Test
    public void f3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac5.xml");
        Student student=(Student) ac.getBean("student");
        System.out.println(student.getName());
        //对象销毁 结束程序时销毁/容器关闭时销毁
        AbstractApplicationContext aac=(AbstractApplicationContext) ac;//强转成派生类
        aac.registerShutdownHook();//关闭容器
    }

    @Test
    public void f4(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac5.xml");
        Student student=(Student) ac.getBean("student");
        System.out.println(student.getName());
        //对象销毁 结束程序时销毁/容器关闭时销毁
        AbstractApplicationContext aac=(AbstractApplicationContext) ac;//强转成派生类
        aac.registerShutdownHook();//关闭容器
    }

    @Test
    public void f5(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac7.xml");
        UserController userController=(UserController) ac.getBean("userController");
        userController.userAdd();

    }
}
