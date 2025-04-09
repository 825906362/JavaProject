import nynu.pojo.Book;
import nynu.pojo.User;
import nynu.service.AccountService;
import nynu.service.BookService;
import nynu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringMybatisTest {
    @Test
    public void f1(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("ac.xml");
        UserService userService= (UserService) ac.getBean("userService");
        List<User> userList=userService.findAll();
        for(User user:userList)
            System.out.println(user);
    }
    @Test
    public void f2(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("ac.xml");
        BookService bookService= (BookService) ac.getBean("bookService");
        List<Book>bookList=bookService.findAll();
        for(Book book:bookList)
            System.out.println(book);
    }
    @Test
    public void f3(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("ac.xml");
        BookService bookService= (BookService) ac.getBean("bookService");
        Book book=bookService.findById(1);
        System.out.println(book);
    }
    @Test
    public void f4(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("ac.xml");
        AccountService accountService= (AccountService) ac.getBean("accountService");
        accountService.transfer("张三","李四",200);
    }//没有事务，导致张三账户减少，李四账户没有增加

    @Test
    public void f5(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("applicationContext-tx.xml");
        AccountService accountService= (AccountService) ac.getBean("accountService");
        accountService.transfer("张三","李四",200);
    }//没有事务，导致张三账户减少后回滚回复，李四账户没有增加
    @Test
    public void f6(){
        ApplicationContext ac=
                new ClassPathXmlApplicationContext("applicationContext-tx2.xml");
        AccountService accountService= (AccountService) ac.getBean("accountService");
        accountService.transfer("张三","李四",200);
    }//没有事务，导致张三账户减少后回滚回复，李四账户没有增加
}
