package com.tnt.mapper;

import com.tnt.pojo.Shopitems;
import com.tnt.pojo.ShopitemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopitemsMapper {
    int countByExample(ShopitemsExample example);

    int deleteByExample(ShopitemsExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(Shopitems record);

    int insertSelective(Shopitems record);

    List<Shopitems> selectByExample(ShopitemsExample example);

    Shopitems selectByPrimaryKey(Integer itemId);

    int updateByExampleSelective(@Param("record") Shopitems record, @Param("example") ShopitemsExample example);

    int updateByExample(@Param("record") Shopitems record, @Param("example") ShopitemsExample example);

    int updateByPrimaryKeySelective(Shopitems record);

    int updateByPrimaryKey(Shopitems record);
}