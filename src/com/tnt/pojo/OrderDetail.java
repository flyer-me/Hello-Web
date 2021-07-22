package com.tnt.pojo;

public class OrderDetail {
    private Integer detailId;

    @Override
	public String toString() {
		return "OrderDetail [detailId=" + detailId + ", detailOrder=" + detailOrder + ", detailGoods=" + detailGoods
				+ ", detailPrice=" + detailPrice + ", detailNum=" + detailNum + ", detail_good=" + detail_good + "]";
	}

	private String detailOrder;

    private Integer detailGoods;

    private Float detailPrice;

    private Integer detailNum;
    //+
    private Goods detail_good;

    public Integer getDetailId() {
        return detailId;
    }

    public void setDetailId(Integer detailId) {
        this.detailId = detailId;
    }

    public String getDetailOrder() {
        return detailOrder;
    }

    public void setDetailOrder(String detailOrder) {
        this.detailOrder = detailOrder == null ? null : detailOrder.trim();
    }

    public Integer getDetailGoods() {
        return detailGoods;
    }

    public void setDetailGoods(Integer detailGoods) {
        this.detailGoods = detailGoods;
    }

    public Float getDetailPrice() {
        return detailPrice;
    }

    public void setDetailPrice(Float detailPrice) {
        this.detailPrice = detailPrice;
    }

    public Integer getDetailNum() {
        return detailNum;
    }

    public void setDetailNum(Integer detailNum) {
        this.detailNum = detailNum;
    }

	public Goods getDetail_good() {
		return detail_good;
	}

	public void setDetail_good(Goods detail_good) {
		this.detail_good = detail_good;
	}
}