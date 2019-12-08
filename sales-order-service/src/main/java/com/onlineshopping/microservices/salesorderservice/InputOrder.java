package com.onlineshopping.microservices.salesorderservice;

import java.util.Date;
import java.util.List;


public class InputOrder {
	
	private String orderDesc;
	private Date orderDate;
	private Long custId;
	private List<OrderLineItems> lineItems;
	
	public InputOrder() {}
	
	public InputOrder(String orderDesc, Date orderDate, Long custId, List<OrderLineItems> lineItems) {
		super();
		this.orderDesc = orderDesc;
		this.orderDate = orderDate;
		this.custId = custId;
		this.lineItems = lineItems;
	}

	public String getOrderDesc() {
		return orderDesc;
	}

	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}

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

	public List<OrderLineItems> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<OrderLineItems> lineItems) {
		this.lineItems = lineItems;
	}
	
	
	
	

}
