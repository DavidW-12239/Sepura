package org.sepura.service;

import org.sepura.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User login(String uname , String pwd );
    void register(User user);
    Boolean checkEmail(String email);
    User getUserById(Integer id);
    Boolean checkUserName(String uname);
}
