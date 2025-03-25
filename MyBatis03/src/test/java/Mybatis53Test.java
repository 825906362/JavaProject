import nynu.mapper.TbUserMapper;
import nynu.pojo.TbOrders;
import nynu.pojo.TbUser;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Mybatis53Test {
    TbUserMapper tbUserMapper;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        tbUserMapper=sqlSession.getMapper(TbUserMapper.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }


    @Test
    public void findUserById3Test(){
        TbUser tbUser=tbUserMapper.findUserById3(1);
        System.out.println(tbUser);
    }

    @Test
    public void findUserById5Test(){
        TbUser tbUser=tbUserMapper.findUserById5(1);
        System.out.println(tbUser);
    }
}
