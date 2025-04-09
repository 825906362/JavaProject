package nynu.service.impl;

import nynu.mapper.UserMapper;
import nynu.pojo.User;
import nynu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
/*    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }*/

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
