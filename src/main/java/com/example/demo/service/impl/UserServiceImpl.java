package com.example.demo.service.impl;

import com.example.demo.bean.UserExample;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public long countAll() throws RuntimeException {
        UserExample example = new UserExample();
        long count = userMapper.countByExample(example);
        return count;
    }
}
