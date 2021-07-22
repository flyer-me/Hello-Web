package com.tnt.mapper;

import java.util.List;

import com.tnt.pojo.Shopitems;
import com.tnt.pojo.ShopitemsExample;

public interface ShopitemsMapper {
	
	/*
	 * 包含操作:列表
	 */
    int countByExample(ShopitemsExample example);

    int deleteByPrimaryKey(Integer itemId);

    int insert(Shopitems record);

    List<Shopitems> selectByExample(ShopitemsExample example);

    Shopitems selectByPrimaryKey(Integer itemId);

	List<Shopitems> getShopitemsList();

}