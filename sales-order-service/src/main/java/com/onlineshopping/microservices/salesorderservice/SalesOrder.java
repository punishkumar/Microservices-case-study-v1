package com.onlineshopping.microservices.salesorderservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class SalesOrder {
	
	@Id
	@Column(name="sales_order_id")
	private Long salesOrderId;
	@Column(name="order_date")
	private Date orderDate;
	@Column(name="cust_id")
	private Long custId;
	@Column(name="order_desc")
	private String orderDesc;
	@Column(name="total_price")
	private Float totalPrice;
	
	
	
		
	public SalesOrder() {}
	
	public SalesOrder(Long salesOrderId, Date orderDate, Long custId, String orderDesc, Float totalPrice) {
		super();
		this.salesOrderId = salesOrderId;
		this.orderDate = orderDate;
		this.custId = custId;
		this.orderDesc = orderDesc;
		this.totalPrice = totalPrice;
	}

	
	 public Long getSalesOrderId() { return salesOrderId; }
	 
	 public void setSalesOrderId(Long salesOrderId) { this.salesOrderId =
	 salesOrderId; }
	 

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}


	
	
	
	
	

}
