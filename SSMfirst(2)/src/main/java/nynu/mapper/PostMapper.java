package nynu.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import nynu.pojo.Post;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface PostMapper {
    List<Post> selectPost(@Param("postName") String postName,
                          @Param("postContext") String postContext,
                          @Param("minId") Integer minId,
                          @Param("maxId") Integer maxId);
}
