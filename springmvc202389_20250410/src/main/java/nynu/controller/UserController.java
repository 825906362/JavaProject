package nynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/User")
public class UserController {
    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String f1(){
        return "login";
    }
    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String f2(String username,String password,Model model){
        if(username.equals("zhangsan") && password.equals("123")){
            model.addAttribute("username",username);
            return "index";
        }else{
            model.addAttribute("message","用户名或者密码错误");
            return "login";
        }
    }
}
