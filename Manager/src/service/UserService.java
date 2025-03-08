package service;

import entity.User;
import utils.ConfigUtils;
import java.util.Properties;

public class UserService {
    private User currentUser;

    // 登录方法，验证用户名和密码
    public boolean login(String username, String password) {
        Properties props = ConfigUtils.loadProperties("db.properties");
        String configuredUsername = props.getProperty("username");
        String configuredPassword = props.getProperty("password");

        if (configuredUsername.equals(username) && configuredPassword.equals(password)) {
            currentUser = new User(username, password);
            System.out.println("登录成功！欢迎 " + username);
            return true;
        } else {
            System.out.println("用户名或密码错误！");
            return false;
        }
    }
}
