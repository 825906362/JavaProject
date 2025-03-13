import nynu.mapper.TbUserMapper;
import nynu.mapper.UserMapper2;
import nynu.pojo.TbOrders;
import nynu.pojo.TbUser;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Mybatis42Test {
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
    public void findUserByIdTest(){
        TbUser tbUser=tbUserMapper.findUserById(1);
        //System.out.println(tbUser);
        System.out.println(tbUser.getUsername());

        System.out.println(tbUser.getOrdersList());
    }

    @Test
    public void findUserById2Test(){
        TbUser tbUser=tbUserMapper.findUserById2(1);
        System.out.println(tbUser);
    }

    @Test
    public void findOrdersById(){
        TbOrders tbOrders=tbUserMapper.findOrdersById(4);
        System.out.println(tbOrders);
    }

}
