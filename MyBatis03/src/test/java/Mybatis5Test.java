import nynu.mapper.BookMapper;
import nynu.pojo.Book;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Mybatis5Test {
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


    @Test
    public void findTest(){
        Book book=bookMapper.findBookById(1);
        System.out.println(book);
    }

    @Test
    public void insertTest(){
        Book book=new Book();
        book.setBookname("数据结构");
        bookMapper.insertBook(book);
        sqlSession.commit();
    }

    @Test
    public void deleteTest(){
        bookMapper.deleteBook(3);
        sqlSession.commit();
    }

    @Test
    public void updateTest(){
        Book book=new Book();
        book.setId(1);
        book.setBookname("数据结构");
        bookMapper.updateBook(book);
        sqlSession.commit();
    }

    @Test
    public void selectTest(){
        List<Book> bookList=bookMapper.findBookByName("数据");
        for(Book book:bookList){
            System.out.println(book);
        }
    }



}
