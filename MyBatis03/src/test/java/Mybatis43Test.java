import nynu.mapper.TbProductMapper;
import nynu.mapper.UserMapper2;
import nynu.pojo.TbProduct;
import nynu.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Mybatis43Test {
    TbProductMapper tbProductMapper;
    SqlSession sqlSession;
    @Before /*调用前自动执行*/
    public void before(){

        sqlSession = MyBatisUtils.getSession();
        //Mybatis框架提供借助sqlSession类方法生成mapper类对象，将mapper接口和对应的xml结合起来
        tbProductMapper=sqlSession.getMapper(TbProductMapper.class);
    }
    @After /*调用后自动执行*/
    public void after(){
        sqlSession.close();
    }

    @Test
    public void findProductByIdWithOrdersTest(){
        List<TbProduct> tbProduct=tbProductMapper.findProductByIdWithOrders(1);
        System.out.println(tbProduct);
    }


    @Test
    public void findProductByIdWithOrders2(){
        List<TbProduct> tbProduct=tbProductMapper.findProductByIdWithOrders2(1);
        System.out.println(tbProduct);
    }
}
