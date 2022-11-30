package org.sepura;

import org.sepura.mapper.*;
import org.sepura.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootTest
public class ServiceTest {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    DataSource dataSource;

    @Autowired
    UserMapper userMapper;

    @Autowired
    UserService userService;


    /*@Test
    void loginServiceTest(){
        User user = userService.login("lina", "ok");
        System.out.println(user.getUname());
    }*/


}



