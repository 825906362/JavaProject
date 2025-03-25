package nynu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor//缓存起作用，网络传输中串行化
@TableName("tb_book") //默认表名和类同名
public class Book implements Serializable {
    @TableId(type= IdType.AUTO) //表示是一个自动递增的id 1 2 3
    Integer id;
    String bookname;
    Double price;
    String author;
}
