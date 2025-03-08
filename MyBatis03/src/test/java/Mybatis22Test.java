import nynu.mapper.UserMapper2;
import nynu.pojo.User;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Mybatis22Test {
    UserMapper2 userMapper2;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        userMapper2=sqlSession.getMapper(UserMapper2.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }
    @Test
    public void userInsertTest(){
        User user=new User();
        user.setUname("金吒");
        user.setUage(30);
        Integer row=userMapper2.addUser(user);
        if(row!=0)System.out.println("添加成功："+row+"行");
        /*查询不用提交，但是增删改必须要提交，没有提交将执行后再撤回*/
        sqlSession.commit();
        System.out.println();
    }
    @Test
    public void userInsertTest2(){
        User user=new User();
        user.setUname("金吒");
        user.setUage(30);
        Integer row=userMapper2.addUser2(user);
        if(row!=0)System.out.println("添加成功："+row+"行");
        /*查询不用提交，但是增删改必须要提交，没有提交将执行后再撤回*/
        sqlSession.commit();
        System.out.println(user.getUid());
    }
    @Test
    public void userInsertTest3(){
        User user=new User();
        user.setUname("金吒");
        user.setUage(30);
        Integer uid=userMapper2.addUser3(user);
        sqlSession.commit();
        System.out.println(user.getUid());
    }
    @Test
    public void userInsertTest4(){
        User user=new User();
        user.setUname("金吒");
        user.setUage(30);
        Integer row=userMapper2.addUser2(user);
        if(row!=0)System.out.println("添加成功："+row+"行");
        /*查询不用提交，但是增删改必须要提交，没有提交将执行后再撤回*/
        sqlSession.commit();
        System.out.println(user.getUid());
    }
    @Test
    public void userInsertTest5(){
        User user=new User();
        user.setUname("金吒");
        user.setUage(30);
        Integer row=userMapper2.addUser(user);
        if(row!=0)System.out.println("添加成功："+row+"行");
        /*查询不用提交，但是增删改必须要提交，没有提交将执行后再撤回*/
        sqlSession.commit();
        System.out.println();
    }
    @Test
    public void userUpdateTest5(){
        User user=new User();
        user.setUname("黑马程序员");
        user.setUage(30);
        user.setUid(1);
        Integer row=userMapper2.userUpdate(user);
        if(row!=0)System.out.println("添加成功："+row+"行");
        /*查询不用提交，但是增删改必须要提交，没有提交将执行后再撤回*/
        sqlSession.commit();
    }
    @Test
    public void userDelete(){
        Integer row=userMapper2.userDalete(3);
        if(row!=0)System.out.println("删除成功："+row+"行");
        else System.out.println("删除失败，要删除的记录不存在");
        /*查询不用提交，但是增删改必须要提交，没有提交将执行后再撤回*/
        sqlSession.commit();
    }
    @Test
    public void userfindTest(){
        User user=userMapper2.findById(1);
        System.out.println(user);
    }
}
