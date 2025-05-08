package nynu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("card")
public class Card implements Serializable {
    @TableId(type= IdType.AUTO)
    Integer cardId;
    String cardTitle;
    String cardContent;
    String cardTime;
    String cardType;
    String cardImg;
    Integer userId;
}
