package com.coder520.mamabike.user.controller;

import com.coder520.mamabike.user.dao.UserMapper;
import com.coder520.mamabike.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/test")
    public User test() {
        return userMapper.selectByPrimaryKey(2L);
    }
}
