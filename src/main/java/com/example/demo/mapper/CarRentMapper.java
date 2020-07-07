package com.example.demo.mapper;

import com.example.demo.bean.CarRent;
import com.example.demo.bean.CarRentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarRentMapper {
    long countByExample(CarRentExample example);

    int deleteByExample(CarRentExample example);

    int insert(CarRent record);

    int insertSelective(CarRent record);

    List<CarRent> selectByExample(CarRentExample example);

    int updateByExampleSelective(@Param("record") CarRent record, @Param("example") CarRentExample example);

    int updateByExample(@Param("record") CarRent record, @Param("example") CarRentExample example);
}