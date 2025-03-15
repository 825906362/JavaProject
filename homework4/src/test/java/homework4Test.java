import mapper.CategoryMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.Category;
import pojo.Product;
import utils.MyBatisUtils;

import java.util.List;

public class homework4Test {
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


    /*嵌套语句查询*/
    @Test
    public void findCategoryByTypeName1Test(){
        List<Category> categories=categoryMapper.findProductByCategory1("白色家电");
        System.out.println(categories);
    }
    /*嵌套结果查询*/
    @Test
    public void findCategoryByTypeName2Test(){
        List<Category> categories=categoryMapper.findProductByCategory2("白色家电");
        System.out.println(categories);
    }

}
