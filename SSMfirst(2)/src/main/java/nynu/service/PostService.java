package nynu.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import nynu.pojo.Post;

import java.util.List;


public interface PostService {
    List<Post> selectPost(Integer pageNum, Integer pageSize);
}
