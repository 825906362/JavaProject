package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {
    Integer goodsId;
    String goodsName;
    Integer price;
    Integer typeId;
}
