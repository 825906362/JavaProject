package nynu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
@Data
@TableName("user")
public class User implements Serializable {
    @TableId(type= IdType.AUTO)
    Integer userId;
    String userCode;
    String userName;
    String userPassword;
    String userState;
}
