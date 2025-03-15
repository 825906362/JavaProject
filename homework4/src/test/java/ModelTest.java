import mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import utils.MyBatisUtils;

public class ModelTest {
    CategoryMapper categoryMapper;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        categoryMapper=sqlSession.getMapper(CategoryMapper.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }

}
