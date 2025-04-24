package nynu.controller;

import nynu.pojo.User;
import nynu.service.UserService;
import nynu.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "toPage/{pageAddress}",method = RequestMethod.GET)
    public String toPage( @PathVariable("pageAddress") String pageAddress){
        System.out.println("通过地址栏请求通用页面");
        return pageAddress;
    }

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String toLogin(){
        System.out.println("通过地址栏请求登录页面");
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(String userCode, String userPassword, User user  ,
                            Model model, HttpSession session){
        System.out.println("页面填写用户信息后登录提交进入");
        System.out.println("获取到页面输入信息"+user);
        System.out.println("获取到页面输入信息"+userCode+","+userPassword);
        User user2=userService.findUserByUserCodeAndPasword(user);
        System.out.println("从数据库中查询出来的"+user2);
        if(user2==null){
            //model中数据只在页面地址不改变时候有用
            model.addAttribute("message","用户名或者密码错误！！！");
            return "login";
        }
        else{
            //跨页面数据传递，用Session
            session.setAttribute("USER123",user2);
            //return "index";//问题是页面刷新之后又重新登陆
            return "redirect:/toPage/index";
        }
    }

}
