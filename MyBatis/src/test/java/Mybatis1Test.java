import nynu.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Mybatis1Test {
    @Test
    public void f1()  {
        try {
            /*读配置文件*/
            Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
            /*会话工厂*/
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
            /*创建会话*/
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //执行操作
            User user=sqlSession.selectOne("nynu.mapper.findById",2);

            System.out.println(user);
            sqlSession.close();

        } catch (IOException e) {
            System.out.println("配置文件名不正确！！");
            e.printStackTrace();
        }
    }
    @Test
    public void f2()  {
        try {
            /*读配置文件*/
            Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
            /*会话工厂*/
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
            /*创建会话*/
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //执行操作
            List<User> userList =sqlSession.selectList("nynu.mapper.findAll");

            System.out.println(userList);
            
            sqlSession.close();

        } catch (IOException e) {
            System.out.println("配置文件名不正确！！");
            e.printStackTrace();
        }
    }
}
