package nynu.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TbPerson {
    Integer id; //不要用int，因为int不能为null值
    String name;
    Integer age;
    String sex;
    Integer cardId; //对应表tb_idcard(id,code,address)
    TbIdCard tbIdCard; //子对象,用来实现一对一关联


}
