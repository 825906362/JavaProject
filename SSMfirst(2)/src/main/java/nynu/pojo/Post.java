package nynu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("post")
public class Post implements Serializable {
    @TableId(type= IdType.AUTO)
    Integer postId;
    String postName;
    String postContext;
}