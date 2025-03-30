import nynu.controller.UserController;
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

    /* 用户发出注册信息->controller(获取页面中的数据)->业务处理service(mapper查询看看用户名存在,返回给controller)->
    ->mapper中添加(结果传递给controller)->controller对结果进行包装->包装后反馈给页面->页面显示出来
    mvc model数据 view页面 controller处理层
    * */

    @Test
    public void f6(){
        UserController userController=new UserController();
        System.out.println("--------------");
        userController.userAdd();
        System.out.println("--------------");
    }
    //错误,空指针->没有new userMapper对象
    //如果用new来生成对象,每次都生成一次
    //  service mapper应该是单例,不能使用new,只能有一个值,利用spring容器注入值

    @Test
    public void f7(){
        ApplicationContext ac2=new ClassPathXmlApplicationContext("ac2.xml");
        UserController userController=(UserController)ac2.getBean("userController");;
        System.out.println("--------------");
        userController.userAdd();
        System.out.println("--------------");
    }
}
