package nynu.mapper;

/*注意事项
*  1.要求 接口名 和 对应的xml文件 同名
*  2.要求 接口名_带路径 和 xml中namespace 一样
*  3.接口方法名 和 xml中的id 相同
*  4.接口参数 和 xml中的参数 相同
*  5.接口返回值类型 和 xml中的返回值类型 相同
* */

import nynu.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User findById(int uid);
    List<User> findAll();
    List<User> findByName(String uname);
    List<User> findByNameAndAge(@Param("uname")String uname, @Param("uage")Integer uage);
    Integer addUser(User user);
}
