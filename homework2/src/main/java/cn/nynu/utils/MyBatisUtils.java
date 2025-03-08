package cn.nynu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class MyBatisUtils {
    /*静态方法和静态代码段的区别
    *  静态方法：通过类名直接多次调用，调用一次执行一次
    *  静态代码段：只有类被初次使用的时候调用，且只调用一次
    * */
    static SqlSessionFactory sqlSessionFactory;
    static{
        try{
            /*读配置文件*/
            //Reader reader= Resources.getResourceAsReader("mybatis-config.xml");
            InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
            /*会话工厂*/
            //sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("mybatis-config.xml没有找到!");
        }
    }
    public static SqlSession getSession() {
        /*创建会话*/
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
