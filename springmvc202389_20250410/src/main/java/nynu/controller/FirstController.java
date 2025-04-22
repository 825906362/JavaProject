package nynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
    @RequestMapping("/one")
    public String f1(){
        System.out.println("第一个springmvc项目");
        return "first";
        //D:\lu\springmvc202389_20250410\src\main\webapp\WEB-INF\pages\first.jsp
        //D:\lu\springmvc202389_20250410\src\main\webapp 视图解析器识别
        // \WEB-INF\pages\ prefix
        //.jsp suffix
    }
    @RequestMapping("/two")
    public String f2(Model model){
        System.out.println("two请求体调用f2函数");
        model.addAttribute("student","2023级89班曲冠豪");
        return "second";
    }
    @RequestMapping("/three")
    public ModelAndView f3(ModelAndView mv){
        System.out.println("three请求体调用f3函数");
        mv.addObject("student","2023级89班曲冠豪");
        mv.addObject("coure","JavaEE");
        mv.setViewName("second");
        return mv;
    }
}
