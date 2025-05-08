package nynu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import nynu.mapper.PostMapper;
import nynu.pojo.Post;
import nynu.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PostServiceImpl implements PostService {
    @Autowired
    PostMapper postMapper;

    @Override
    public List<Post> selectPost(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return postMapper.selectPost();
    }
}
