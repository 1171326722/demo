package com.example.demo.controller;

import com.example.demo.service.impl.CarServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("car")
public class CarController {

    @Autowired
    private CarServiceImpl carServiceImpl;

    @GetMapping("countAll")
    @ApiOperation(value = "统计汽车数")
    public long countAll(){
        long count = carServiceImpl.countAll();
        return count;
    }
}
