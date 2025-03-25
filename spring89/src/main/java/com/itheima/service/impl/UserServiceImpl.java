package com.itheima.service.impl;

import com.itheima.dao.UserDao;

public class UserServiceImpl implements com.itheima.service.UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
