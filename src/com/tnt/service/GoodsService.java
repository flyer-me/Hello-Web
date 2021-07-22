package com.tnt.service;

import java.util.List;

import com.tnt.pojo.Goods;
import com.tnt.pojo.GoodsType;
import com.tnt.util.PageUtil;

public interface GoodsService {

	int getProductCount(Goods goods);

	List<Goods> getGoodsList(Goods goods);

	List<Goods> getGoodsList(Goods goods, PageUtil pageUtil);

	List<GoodsType> getTypeList();

	List<Goods> getAllGoodsList();

}
