package nynu.service;

import nynu.pojo.User;

public interface UserService {
    User findUserByUserCodeAndPasword(User user);
}
