import nynu.controller.UserController;
import nynu.pojo.User;
import nynu.service.UserService;
import nynu.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring7Test {
    @Test
    public void f1(){
        //加载spring容器(读xml文件)
        ApplicationContext ac3=new ClassPathXmlApplicationContext("ac3.xml");
        System.out.println("--------------");
        User user1=(User)ac3.getBean("user1");//获取spring容器中生成好的对象，对象已经存在
        User user2=(User)ac3.getBean("user2");
        User user3=(User)ac3.getBean("user3");//user2和user3是同一个对象
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());
        System.out.println("--------------");
    }

    @Test
    public void f2(){
        //加载spring容器(读xml文件)
        ApplicationContext ac3=new ClassPathXmlApplicationContext("ac3.xml");
        System.out.println("--------------");
        User user4=(User)ac3.getBean("user4");
        System.out.println("--------------");
        User user5=(User)ac3.getBean("user5");
        System.out.println("--------------");
    }
    //service mapper应该是单例,不能使用new,只有一个值,利用spring容器注入
    //controller 应该是原型模式,有多个值,可以用new

    @Test
    public void f3() {
        //加载spring容器(读xml文件)
        ApplicationContext ac3 = new ClassPathXmlApplicationContext("ac3.xml");
        System.out.println("--------------");
        User user6 = (User) ac3.getBean("user6");
        System.out.println(user6.getScoreMap());
        System.out.println("--------------");
    }

    @Test
    public void f4() {
        //加载spring容器(读xml文件)
        ApplicationContext ac = new ClassPathXmlApplicationContext("ac.xml");
        System.out.println("--------------");
        /*获取bean对象的方法有三种*/
        /*方法1:通过id来获取对象*/
        User user1=(User)ac.getBean("user1");
        /*方法2:通过类名来获取对象,如果容器内有该类的多个对象就报错*/
        //User user2=ac.getBean(User.class);
        /*方法3:通过id+类名来获取对象,如果容器内有该类的多个对象也不报错*/
        User user3=ac.getBean("user1",User.class);
    }
}
