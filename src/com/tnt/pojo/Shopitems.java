package com.tnt.pojo;

import javax.servlet.http.HttpSession;

/*
 * 购物车
 */
public class Shopitems {
	
	//购物车商品编号（主键）
    private Integer item_id;

    private Integer item_goods;

    private Integer item_num;

    private Integer item_user;

    //----------------set
	public void setItemId(Integer item_id) {
        this.item_id = item_id;
    }
    public void setItemGoods(Integer item_goods) {
        this.item_goods = item_goods;
    }
    public void setItemNum(Integer item_num) {
        this.item_num = item_num;
    }
    public void setItemUser(Integer item_user) {
        this.item_user = item_user;
    }
    //----------------get
    public Integer getItemId() {
        return item_id;
    }
    public Integer getItemGoods(){
		return item_goods;
    }
    public Integer getItemNum(){
		return item_num;
    }
    public Integer getItemUser(){
		return item_user;
    }
    //??
    public Integer getUserName(){
		return item_goods;
    	
    }

	public HttpSession getShopitemsList() {
		// TODO Auto-generated method stub
		return null;
	}

	public Shopitems(Integer item_id, Integer item_goods, Integer item_num, Integer item_user) {
		super();
		this.item_id = item_id;
		this.item_goods = item_goods;
		this.item_num = item_num;
		this.item_user = item_user;
	}
	   
    public Shopitems() {
		super();
		// 
	}


}