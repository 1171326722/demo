package com.example.demo.service.impl;

import com.example.demo.bean.CarExample;
import com.example.demo.bean.UserExample;
import com.example.demo.mapper.CarMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;


    @Override
    public long countAll() throws RuntimeException{
        CarExample example = new CarExample();
        long count = carMapper.countByExample(example);
        return count;
    }

}
