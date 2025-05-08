package nynu.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import nynu.pojo.Post;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface PostMapper {
    @Select("SELECT * FROM POST")
    List<Post> selectPost();

}
