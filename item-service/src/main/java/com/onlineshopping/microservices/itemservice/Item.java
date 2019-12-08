package com.onlineshopping.microservices.itemservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@Column(name="item_id")
	private Long itemId;
	@Column(name="item_name")
	private String itemName;
	@Column(name="item_desc")
	private String desc;
	@Column(name="item_price")
	private Float price;
	

	
	public Item() {}
	
	public Item(Long itemId, String itemName, String desc, Float price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.desc = desc;
		this.price = price;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
