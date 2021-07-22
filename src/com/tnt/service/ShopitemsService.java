package com.tnt.service;

import java.util.List;

import com.tnt.pojo.Goods;
import com.tnt.pojo.Shopitems;

public interface ShopitemsService {

	//购物车
	int insertCart(Shopitems shopitems);
	
	//显示
	List<Shopitems> getShopitemsList();

	List<Shopitems> getShopitems();
}
