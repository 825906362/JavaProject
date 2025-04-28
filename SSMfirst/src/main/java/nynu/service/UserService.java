package nynu.service;

import nynu.pojo.User;

import java.util.List;

public interface UserService {
    User findUserByUserCodeAndPasword(User user);
    List<User> findUser();
}