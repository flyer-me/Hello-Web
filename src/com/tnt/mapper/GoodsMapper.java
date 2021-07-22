package com.tnt.mapper;

import com.tnt.pojo.Goods;
import com.tnt.pojo.GoodsType;
import com.tnt.util.PageUtil;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface GoodsMapper {
    
    
    //查询总记录数
	int getGoodsCount(Goods goods);
	//查询所有商品列表
	List<Goods> getGoodsList(Goods goods);

	List<Goods> getGoodsList(@Param("goods")Goods goods,@Param("page") PageUtil pageUtil);

	@Select("select * from goods_type")
	List<GoodsType> getTypeList();
	
	List<Goods> getAllGoodsList();
}