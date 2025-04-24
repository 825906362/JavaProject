package nynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/User")
public class UserController {
    /*
    @RequestMapping("toPage/index")
    public String f(String username,Model model){
        model.addAttribute("username",username);
        return "index";
    }*/

    @RequestMapping("toPage/{page}")
    public String f(@PathVariable String page){
        return page;
    }

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String f1(){
        return "login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String f2(String username, String password, Model model, HttpSession httpSession){
        if(username.equals("zhangsan") && password.equals("123")){
            //不跳转页面可以拿到数据
            //model.addAttribute("username",username);
            //可以跳转页面拿到数据，但是会话时间默认是30分钟，30分钟后数据消失
            httpSession.setAttribute("username",username);
            return "redirect:toPage/index";
        }else{
            model.addAttribute("message","用户名或者密码错误!!!");
            return "login";
        }
    }




}
