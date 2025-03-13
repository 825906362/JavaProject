package nynu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TbOrders {
    Integer id;
    String number;
    Integer userId;
    TbUser tbUser;
}
