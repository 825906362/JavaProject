import mapper.SStudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.CClass;
import pojo.SStudent;
import utils.MyBatisUtils;

import java.util.List;

public class homework5Test {
    SStudentMapper sStudentMapper;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        sStudentMapper=sqlSession.getMapper(SStudentMapper.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }

//    查询id为2的学生信息
    @Test
    public void selectStudentByIdTest(){
        SStudent sStudent=sStudentMapper.selectStudentById(2);
        System.out.println(sStudent);
    }

//    查询二班所有学生的信息
    @Test
    public void selectClassByIdTest(){
        CClass cClass=sStudentMapper.selectClassById(2);
        System.out.println(cClass);
    }

//    将id为4的学生姓名修改为李雷，年龄修改为21
    @Test
    public void UpdateStudentByIdAgeTest(){
        Integer row=sStudentMapper.UpdateStudentByIdAge(4,"李雷",21);
        if(row!=0)System.out.println("修改成功");
        else System.out.println("修改失败");
        sqlSession.commit();
        SStudent sStudent=sStudentMapper.selectStudentById(4);
        System.out.println(sStudent);
    }

}
