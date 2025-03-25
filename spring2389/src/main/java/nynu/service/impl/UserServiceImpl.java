package nynu.service.impl;

import nynu.mapper.UserMapper;
import nynu.service.UserService;

public class UserServiceImpl implements UserService {
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    UserMapper userMapper;

    public void userAdd(){
        userMapper.insert();
        System.out.println("Service层添加");
    }
}
