package nynu.pojo;

import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.*;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class TbUser {
    Integer id;
    String username;
    String address;
    List<TbOrders> ordersList;
}
