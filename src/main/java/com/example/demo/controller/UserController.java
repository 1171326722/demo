package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.impl.UserServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("countAll")
    @ApiOperation(value = "统计用户数")
    public long countAll(){
    long count = userServiceImpl.countAll();
    return count;
    }


    @GetMapping("showUser")
    @ApiOperation(value = "用户信息")
    public List<User> userInfo() {
        List<User> userinfo = userServiceImpl.userInfo();
        return userinfo;
    }



}
