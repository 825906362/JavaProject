package nynu.mapper;

import nynu.pojo.TbOrders;
import nynu.pojo.TbUser;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface TbUserMapper {
    TbUser findUserById(Integer id);
    TbUser findUserById2(Integer id);
    TbOrders findOrdersById(Integer id);

    @Select("select * from tb_user where id=#{id}")
    @Results({
            @Result(property = "ordersList",column = "id",
            many = @Many(select = "selectOrdersByUserId")
            )
    })
    TbUser findUserById3(Integer id);
    @Select("select * from tb_orders where user_id=#{userId}")
    TbOrders selectOrdersByUserId(Integer userId);

    @Select("select * from tb_user where id=#{id}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "ordersList",column = "id",
                    many = @Many(select = "selectOrdersByUserId")
            )
    })
    TbUser findUserById5(Integer id);
}
