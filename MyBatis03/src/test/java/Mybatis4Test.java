import nynu.mapper.TbPersonMapper;
import nynu.mapper.UserMapper2;
import nynu.pojo.TbPerson;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Mybatis4Test {
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
    public void findPersonByIdTest()
    {
        TbPerson tbperson=tbPersonMapper.findPersonById(2);
        System.out.println(tbperson);
    }

    @Test
    public void findPersonById1Test()
    {
        TbPerson tbperson=tbPersonMapper.findPersonById1(2);
        System.out.println(tbperson);
    }

}
