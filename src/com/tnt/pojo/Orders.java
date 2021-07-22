package com.tnt.pojo;

import java.util.Date;
import java.util.List;

public class Orders {
    private String orderId;

    private Integer orderUser;

    private String orderAddress;

    private String orderPhone;

    private String orderName;

    private Integer orderStatus;

    private Float orderPrice;

    private Date orderTime;
    //++
    private List<OrderDetail> orderDetail;//订单详情
    private OrderStatus orderStatusId;//一对一
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public Integer getOrderUser() {
		return orderUser;
	}
	public void setOrderUser(Integer orderUser) {
		this.orderUser = orderUser;
	}
	public String getOrderAddress() {
		return orderAddress;
	}
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}
	public String getOrderPhone() {
		return orderPhone;
	}
	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Integer getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Float getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(Float orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public OrderStatus getOrderStatusId() {
		return orderStatusId;
	}
	public void setOrderStatusId(OrderStatus orderStatusId) {
		this.orderStatusId = orderStatusId;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}
	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderUser=" + orderUser + ", orderAddress=" + orderAddress
				+ ", orderPhone=" + orderPhone + ", orderName=" + orderName + ", orderStatus=" + orderStatus
				+ ", orderPrice=" + orderPrice + ", orderTime=" + orderTime + ", orderDetail=" + orderDetail
				+ ", orderStatusId=" + orderStatusId + "]";
	}


    
    
    
}