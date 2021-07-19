package com.tnt.mapper;

import com.tnt.pojo.Funs;
import com.tnt.pojo.FunsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FunsMapper {
    int countByExample(FunsExample example);

    int deleteByExample(FunsExample example);

    int deleteByPrimaryKey(Integer funId);

    int insert(Funs record);

    int insertSelective(Funs record);

    List<Funs> selectByExample(FunsExample example);

    Funs selectByPrimaryKey(Integer funId);

    int updateByExampleSelective(@Param("record") Funs record, @Param("example") FunsExample example);

    int updateByExample(@Param("record") Funs record, @Param("example") FunsExample example);

    int updateByPrimaryKeySelective(Funs record);

    int updateByPrimaryKey(Funs record);
}