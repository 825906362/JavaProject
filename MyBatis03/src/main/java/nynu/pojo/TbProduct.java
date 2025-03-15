package nynu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TbProduct {
    Integer id;
    String name;
    Integer price;
    List<TbOrders> ordersList;
}
