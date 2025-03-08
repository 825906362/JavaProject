import nynu.mapper.UserMapper2;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;

public class ModelTest {
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
    

}
