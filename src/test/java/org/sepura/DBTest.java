package org.sepura;


import org.junit.jupiter.api.Test;
import org.sepura.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


@SpringBootTest
public class DBTest {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

/*    @Test
    void testUserMapper(){
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.getUname());
    }*/

    @Test
    void normalTest(){
        System.out.println(userMapper.getUserById(1).getEmail());
    }
}
