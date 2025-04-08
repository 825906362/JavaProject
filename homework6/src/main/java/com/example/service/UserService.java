// UserService.java（服务接口）
package com.example.service;
import com.example.bean.User;

public interface UserService {
    User login(String username, String password);
    boolean register(String username, String password, String className);
}