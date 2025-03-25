import nynu.mapper.BookMapper;
import nynu.mapper.UserMapper2;
import nynu.pojo.Book;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Mybatis44Test {
    BookMapper bookMapper;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        bookMapper=sqlSession.getMapper(BookMapper.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }


    /*一级缓存：一个会话内多次查询一个结果，第二个以后的查询结果不需要再次执行SQL语句
    * 第一次查询之后，将结果放在一级缓存内，第二次查询发现已经有了，就不再执行查询了
    * 如果执行提交（增删改）操作，缓存清空，此时第二个查询就要执行
    * */
    @Test
    public void f1(){
        Book book=bookMapper.findBookById(1);
        System.out.println(book);

        Book book2=bookMapper.findBookById(1);
        System.out.println(book2);
    }
    @Test
    public void f2(){
        Book book=bookMapper.findBookById(1);
        System.out.println(book);

        Book book3=new Book();
        book3.setBookname("MySQL数据库");
        bookMapper.insertBook(book3);

        Book book2=bookMapper.findBookById(1);
        //查询仍要执行，原因是缓存被清空
        System.out.println(book2);

        sqlSession.commit();
    }

    //1.mybatis的setting设置
    //2.xml中cache开启二级缓存
    //3.类中网络传输中串行化接口
    @Test
    public void f3(){
        SqlSession sqlSession1=MyBatisUtils.getSession();
        BookMapper bookMapper1=sqlSession1.getMapper(BookMapper.class);
        Book book=bookMapper1.findBookById(1);
        System.out.println(book);
        sqlSession1.close();//会话不关闭，后一个会话命中不了，继续查询



        SqlSession sqlSession2=MyBatisUtils.getSession();
        BookMapper bookMapper2=sqlSession2.getMapper(BookMapper.class);
        Book book2=bookMapper2.findBookById(1);
        book2=bookMapper2.findBookById(1);
        book2=bookMapper2.findBookById(1);
        book2=bookMapper2.findBookById(1);
        System.out.println(book2);
        sqlSession1.close();
    }

    @Test
    public void f4(){
        SqlSession sqlSession1=MyBatisUtils.getSession();
        BookMapper bookMapper1=sqlSession1.getMapper(BookMapper.class);
        Book book=bookMapper1.findBookById(1);
        System.out.println(book);

        Book book3=new Book();
        book3.setBookname("MySQL数据库");
        bookMapper1.insertBook(book3);//执行增删改-->缓存清空
        sqlSession1.commit();//修改必须提交

        sqlSession1.close();//会话不关闭，后一个会话命中不了，继续查询

        SqlSession sqlSession2=MyBatisUtils.getSession();
        BookMapper bookMapper2=sqlSession2.getMapper(BookMapper.class);
        Book book2=bookMapper2.findBookById(1);
        book2=bookMapper2.findBookById(1);//命中率都是二级缓存，所以命中率都是0.0
        book2=bookMapper2.findBookById(1);//这时候使用一级缓存
        book2=bookMapper2.findBookById(1);
        System.out.println(book2);
        sqlSession2.close();
    }

}
