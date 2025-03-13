package nynu.mapper;

import nynu.pojo.TbOrders;
import nynu.pojo.TbUser;

public interface TbUserMapper {
    TbUser findUserById(Integer id);
    TbUser findUserById2(Integer id);
    TbOrders findOrdersById(Integer id);
}
