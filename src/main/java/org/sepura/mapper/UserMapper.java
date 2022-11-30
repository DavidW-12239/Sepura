package org.sepura.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.sepura.entity.User;

@Mapper
public interface UserMapper {
    User getUser(String uname, String pwd );
    User getUserById(Integer id);
    void addUser(User user);
    User getUserByEmail(String email);
    User getUserByName(String uname);
}
