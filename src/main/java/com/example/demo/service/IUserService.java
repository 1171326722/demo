
package com.example.demo.service;

import com.example.demo.bean.User;

import java.util.List;

public interface IUserService {
    long countAll() throws RuntimeException;
    List<User> userInfo() throws RuntimeException;
}
