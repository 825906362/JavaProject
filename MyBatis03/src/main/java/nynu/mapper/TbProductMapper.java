package nynu.mapper;

import nynu.pojo.TbProduct;

import java.util.List;

public interface TbProductMapper {
    List<TbProduct> findProductByIdWithOrders(Integer id);
    List<TbProduct> findProductByIdWithOrders2(Integer id);
}
