package nynu.controller;

import nynu.service.UserService;
import nynu.service.impl.UserServiceImpl;

public class UserController {
    UserService userService;

    public void userAdd(){
        System.out.println("----controller从页面获取数据,同时调用service----");
        userService.userAdd();
        System.out.println("----controller获取到反馈结果给页面----");
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
