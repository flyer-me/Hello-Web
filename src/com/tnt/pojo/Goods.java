package com.tnt.pojo;

import java.util.Date;

public class Goods {
    

	private Integer goods_id;

    private String goods_name;

    private Float goods_price;

    private Integer goods_num;

    private String goods_img;

    private Integer goods_type_id;
    
    private GoodsType goodsType;

    private Date goods_creat_time;

    private Integer goods_priority;

    private String goods_detail;

	public Integer getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(Integer goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_name() {
		return goods_name;
	}

	public void setGoods_name(String goods_name) {
		this.goods_name = goods_name;
	}

	public Float getGoods_price() {
		return goods_price;
	}

	public void setGoods_price(Float goods_price) {
		this.goods_price = goods_price;
	}

	public Integer getGoods_num() {
		return goods_num;
	}

	public void setGoods_num(Integer goods_num) {
		this.goods_num = goods_num;
	}

	public String getGoods_img() {
		return goods_img;
	}

	public void setGoods_img(String goods_img) {
		this.goods_img = goods_img;
	}

	public Integer getGoods_type_id() {
		return goods_type_id;
	}

	public void setGoods_type_id(Integer goods_type_id) {
		this.goods_type_id = goods_type_id;
	}

	public GoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(GoodsType goodsType) {
		this.goodsType = goodsType;
	}

	public Date getGoods_creat_time() {
		return goods_creat_time;
	}

	public void setGoods_creat_time(Date goods_creat_time) {
		this.goods_creat_time = goods_creat_time;
	}

	public Integer getGoods_priority() {
		return goods_priority;
	}

	public void setGoods_priority(Integer goods_priority) {
		this.goods_priority = goods_priority;
	}

	public String getGoods_detail() {
		return goods_detail;
	}

	public void setGoods_detail(String goods_detail) {
		this.goods_detail = goods_detail;
	}

   
    
}