package nynu.mapper;

/*注意事项
 *  1.要求 接口名 和 对应的xml文件 同名
 *  2.要求 接口名_带路径 和 xml中namespace 一样
 *  3.接口方法名 和 xml中的id 相同
 *  4.接口参数 和 xml中的参数 相同
 *  5.接口返回值类型 和 xml中的返回值类型 相同
 * */

import nynu.pojo.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CustomerMapper {
    List<Customer> findCustomerByUsernameAndJobs(Customer customer);
    List<Customer> findCustomerByUsernameAndJobs2(Customer customer);
    List<Customer> findCustomerByUsernameAndJobs3(Customer customer);
    List<Customer> findCustomerByUsernameAndJobs4(Customer customer);
    List<Customer> findCustomerByIds(Integer id);
    Integer updateCustomer(Customer customer);
    Integer updateCustomer2(Customer customer);
    Integer updateCustomer3(Customer customer);

    List<Customer> selectArray(Integer[] ids);

    List<Customer> selectList(List<Integer> idsList);

    List<Customer> selectMap(Map map);

    List<Customer> selectMap2(Map map);

    //如果有多个参数，每个参数前要加上注解参数名，sql语句中用注解名
    List<Customer> selectMap3(@Param("ids") Map map, @Param("username") String username);

    Integer deleteManyParameter(@Param("ids") Map map, @Param("username") String username);

    Integer insertCustomer(Customer customer);
    Integer insertCustomer2(Customer[] customers);

    Integer insertCustomer3(List<Customer> customerList);

    Integer insertCustomer4(@Param("keys") Map map);
}
