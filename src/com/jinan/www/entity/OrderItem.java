package com.jinan.www.entity;
/*
 * 订单明细信息持久化类
 */
public class OrderItem {
	private Integer id;//主键
	private OrderForm orderid;
	private Commodity commodityid;//订单商品
	private Double discount;//折扣信息 1没有折扣
	private Double actprice;//实际价格
	private Double amount;//数量
	public OrderItem() {
		super();
	}
	
	public OrderItem(Integer id, OrderForm orderid, Commodity commodityid, Double discount, Double actprice,
			Double amount) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.commodityid = commodityid;
		this.discount = discount;
		this.actprice = actprice;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", orderid=" + orderid + ", commodityid=" + commodityid + ", discount="
				+ discount + ", actprice=" + actprice + ", amount=" + amount + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public OrderForm getOrderid() {
		return orderid;
	}
	public void setOrderid(OrderForm orderid) {
		this.orderid = orderid;
	}
	public Commodity getCommodityid() {
		return commodityid;
	}
	public void setCommodityid(Commodity commodityid) {
		this.commodityid = commodityid;
	}
	public Double getDiscount() {
		return discount;
	}
	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	public Double getActprice() {
		return actprice;
	}
	public void setActprice(Double actprice) {
		this.actprice = actprice;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	

}
