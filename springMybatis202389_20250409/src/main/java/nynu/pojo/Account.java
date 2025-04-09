package nynu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
/**
 * @author: 202389
 * @date: 2025/04/09
 */
@Data
@TableName("account")
public class Account {
    @TableId(type = IdType.AUTO)
    Integer id;
    String username;
    Double balance;
}
