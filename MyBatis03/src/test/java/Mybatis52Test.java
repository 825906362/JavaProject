import nynu.mapper.TbPersonMapper;
import nynu.pojo.TbPerson;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Mybatis52Test {
    TbPersonMapper tbPersonMapper;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        tbPersonMapper=sqlSession.getMapper(TbPersonMapper.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }

    @Test
    public void findPersonById3Test(){
        TbPerson tbPerson=tbPersonMapper.findPersonById3(1);
        System.out.println(tbPerson);
    }


}
