package nynu.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import nynu.pojo.Post;
import nynu.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PostController {
    @Autowired
    PostService postService;

    @RequestMapping(value = "/post2")
    public String post(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                       @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize,
                       @RequestParam(value = "postName", required = false) String postName,
                       @RequestParam(value = "postContext", required = false) String postContext,
                       @RequestParam(value = "minId", required = false) Integer minId,
                       @RequestParam(value = "maxId", required = false) Integer maxId,
                       Model model) {
        List<Post> posts = postService.selectPost(pageNum, pageSize,
                postName, postContext,
                minId, maxId);
        PageInfo<Post> pageInfo = new PageInfo<>(posts);
        model.addAttribute("pageNum", pageInfo.getPageNum()); // 使用 PageInfo 的当前页
        model.addAttribute("pageSize", pageSize);
        model.addAttribute("pageList", pageInfo.getList());
        model.addAttribute("totalPage", pageInfo.getPages());
        model.addAttribute("postName",postName);
        model.addAttribute("postContext",postContext);
        model.addAttribute("minId",minId);
        model.addAttribute("maxId",maxId);
        return "post2";
    }
}
