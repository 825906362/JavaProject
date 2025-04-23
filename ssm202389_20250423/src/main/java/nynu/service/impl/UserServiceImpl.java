package nynu.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import nynu.mapper.UserMapper;
import nynu.pojo.User;
import nynu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    public  User findUserByUserCodeAndPasword(User user){
        QueryWrapper<User> queryWrapper=new QueryWrapper<User>();
        queryWrapper.eq("user_code",user.getUserCode());
        queryWrapper.eq("user_password",user.getUserPassword());
        User user2=userMapper.selectOne(queryWrapper);
        return user2;
    }
}
