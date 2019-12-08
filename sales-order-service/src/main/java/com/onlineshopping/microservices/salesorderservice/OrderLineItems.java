package com.onlineshopping.microservices.salesorderservice;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderLineItems {
	
	@Id
	//@GeneratedValue
	@Column(name="line_item_id")
	private Long lineItemId;
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_qty")
	private Integer itemQty;
	@Column(name="order_id")
	private Long orderId;
	
	public OrderLineItems() {}
	
	public OrderLineItems(Long lineItemId, String itemName, Integer itemQty,Long orderId) {
		super();
		this.lineItemId = lineItemId;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.orderId = orderId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getItemQty() {
		return itemQty;
	}

	public void setItemQty(Integer itemQty) {
		this.itemQty = itemQty;
	}

	
	  public Long getOrderId() { return orderId; }
	  
	  public void setOrderId(Long orderId) { this.orderId = orderId; }
	 
	
	
	
	
	
	
	
	
	

}
