package nynu.service;

import nynu.pojo.Post;

import java.util.List;


public interface PostService {
    List<Post> selectPost(Integer pageNum, Integer pageSize,
                          String postName, String postContext,
                          Integer minId, Integer maxId);
}
