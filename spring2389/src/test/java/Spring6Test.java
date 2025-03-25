import nynu.pojo.User;
import nynu.service.UserService;
import nynu.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring6Test {
    @Test
    public void f1(){
        User user=new User(123,"张三","239487");
    }

    @Test
    public void f3(){
        //加载spring容器(读xml文件)
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ac.xml");
        System.out.println("--------------");
        User user=(User)applicationContext.getBean("user1");//获取spring容器中生成好的对象，对象已经存在
        System.out.println(user);
        System.out.println("--------------");
    }

    @Test
    public void f4(){
        UserService userService=new UserServiceImpl();
        userService.userAdd();
    }

    @Test
    public void f5(){
        //加载spring容器(读xml文件)
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ac2.xml");
        System.out.println("--------------");
        UserService userService=(UserService) applicationContext.getBean("userService");
        System.out.println("--------------");
        userService.userAdd();
    }
}
