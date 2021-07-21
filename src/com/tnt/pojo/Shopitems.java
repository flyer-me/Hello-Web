package com.tnt.pojo;

import javax.servlet.http.HttpSession;

/*
 * 购物车
 */
public class Shopitems {
	
	//购物车商品编号（主键）
    private Integer itemId;

    private Integer itemGoods;

    private Integer itemNum;

    private Integer itemUser;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemGoods() {
        return itemGoods;
    }

    public void setItemGoods(Integer itemGoods) {
        this.itemGoods = itemGoods;
    }

    public Integer getItemNum() {
        return itemNum;
    }

    public void setItemNum(Integer itemNum) {
        this.itemNum = itemNum;
    }

    public Integer getItemUser() {
        return itemUser;
    }

    public void setItemUser(Integer itemUser) {
        this.itemUser = itemUser;
    }

	public static boolean insert(String pid) {
		// TODO Auto-generated method stub
		return false;
	}

	public HttpSession getShopitemsList() {
		// TODO Auto-generated method stub
		return null;
	}
}