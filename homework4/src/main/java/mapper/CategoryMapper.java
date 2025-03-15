package mapper;

import pojo.Category;
import pojo.Product;

import java.util.List;

public interface CategoryMapper {
    /*嵌套语句查询*/
    List<Category> findProductByCategory1 (String name);
    /*嵌套结果查询*/
    List<Category> findProductByCategory2(String name);
}
