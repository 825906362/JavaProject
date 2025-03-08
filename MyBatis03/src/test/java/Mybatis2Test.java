import nynu.mapper.UserMapper;
import nynu.pojo.User;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class Mybatis2Test {
    UserMapper userMapper;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        userMapper=sqlSession.getMapper(UserMapper.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }
    @Test
    public void f1()  {
        sqlSession = MyBatisUtils.getSession();
        //执行操作
        User user=sqlSession.selectOne("nynu.mapper.findById",1);

        System.out.println(user);
    }
    @Test
    public void f2()  {
        sqlSession=MyBatisUtils.getSession();
        //执行操作
        List<User> userList =sqlSession.selectList("nynu.mapper.findAll");
        for (User user:userList) {
            System.out.println(user);
        }
    }

    @Test
    public void f3()  {
        User user=userMapper.findById(3);
        System.out.println(user);
    }
    @Test
    public void f4()  {
        List<User> userList=userMapper.findAll();
        for(User user:userList){
            System.out.println(user);
        }
    }
    @Test
    public void f5(){
        List<User> userList= userMapper.findByName("杨");
        for (User user:userList)
            System.out.println(user);
    }
    @Test
    public void f6(){
        List<User> userList= userMapper.findByNameAndAge("杨",20);
        for (User user:userList)
            System.out.println(user);
    }
    @Test
    public void f7(){
        User user=new User();
        user.setUname("小刚1");
        user.setUage(30);
        user.setUserPass(12345);
        Integer row=userMapper.addUser(user);
        if(row==1)System.out.println("添加成功");
        ////如果只执行查找，会话不需要提交，执行增删改操作，会话必须提交，如果不提交，成功后该记录又撤回
        sqlSession.commit();
    }

}
