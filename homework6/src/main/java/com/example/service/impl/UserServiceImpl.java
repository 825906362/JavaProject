package com.example.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.bean.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Transactional // 添加事务管理

    @Override
    public User login(String username, String password) {
        // MyBatisPlus提供的条件构造器查询
        User user = userMapper.selectOne(new QueryWrapper<User>()
                .eq("username", username)
                .eq("password", password));
        if (user == null) throw new RuntimeException("登录失败");
        return user;
    }

    @Override
    public boolean register(String username, String password, String className) {
        // 校验用户名唯一性
        if (userMapper.selectCountByUsername(username) > 0) {
            throw new RuntimeException("用户名已存在");
        }

        // 创建用户对象
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setClassName(className);

        // 执行插入（MyBatisPlus的insert方法）
        return userMapper.insert(user) > 0;
    }
}