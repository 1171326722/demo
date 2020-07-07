package com.example.demo.mapper;

import com.example.demo.bean.Cmp;
import com.example.demo.bean.CmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmpMapper {
    long countByExample(CmpExample example);

    int deleteByExample(CmpExample example);

    int deleteByPrimaryKey(Integer cmpNub);

    int insert(Cmp record);

    int insertSelective(Cmp record);

    List<Cmp> selectByExample(CmpExample example);

    Cmp selectByPrimaryKey(Integer cmpNub);

    int updateByExampleSelective(@Param("record") Cmp record, @Param("example") CmpExample example);

    int updateByExample(@Param("record") Cmp record, @Param("example") CmpExample example);

    int updateByPrimaryKeySelective(Cmp record);

    int updateByPrimaryKey(Cmp record);
}