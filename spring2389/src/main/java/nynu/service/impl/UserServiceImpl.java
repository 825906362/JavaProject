package nynu.service.impl;

import nynu.mapper.UserMapper;
import nynu.service.UserService;

public class UserServiceImpl implements UserService {
    UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public void userAdd(){
        System.out.println("----service去调用mapper----");
        userMapper.insert();
        System.out.println("Service层添加");
        System.out.println("----service将结果传递给controller----");
    }
}
