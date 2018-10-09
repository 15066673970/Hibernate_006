package com.jinan.www.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/*
 * 订单信息持久化类
 */
public class OrderForm {

		private Integer id;//主键
		private Customer customer;//客户
		private Date tradedate;//交易日期
		private String status;//订单状态
		private Double amount;//订单金额
		private Set<OrderItem> orderItems = new HashSet<OrderItem>();//订单明细
		
		public OrderForm() {
			super();
		}
		
		
		public OrderForm(Integer id, Customer customer, Date tradedate, String status, Double amount) {
			super();
			this.id = id;
			this.customer = customer;
			this.tradedate = tradedate;
			this.status = status;
			this.amount = amount;
			
		}


		@Override
		public String toString() {
			return "OrderForm [id=" + id + ", customer=" + customer + ", tradedate=" + tradedate + ", status=" + status
					+ ", amount=" + amount + ", orderItems=" + orderItems + "]";
		}
		
		
		public Set<OrderItem> getOrderItems() {
			return orderItems;
		}
		public void setOrderItems(Set<OrderItem> orderItems) {
			this.orderItems = orderItems;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public Date getTradedate() {
			return tradedate;
		}
		public void setTradedate(Date tradedate) {
			this.tradedate = tradedate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		
		
}
