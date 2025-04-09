package nynu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import nynu.pojo.Book;
import nynu.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper extends BaseMapper<Book> {
    @Select("select * from tb_book")
    List<Book> findAll();
    @Select("select * from tb_book where id = #{id}")
    Book findById(int bookId);
}
