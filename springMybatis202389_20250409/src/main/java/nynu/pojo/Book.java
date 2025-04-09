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
@NoArgsConstructor
@TableName("tb_book")
public class Book implements Serializable {
    // 注释：主键，自增
    @TableId(type = IdType.AUTO)
    Integer id;
    // 注释：书名
    String bookname;
    // 注释：价格
    Double price;
    // 注释：作者
    String author;
}
