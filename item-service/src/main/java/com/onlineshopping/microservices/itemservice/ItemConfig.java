package com.onlineshopping.microservices.itemservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="item-service")
@Component
public class ItemConfig {
	//private Long itemID;
	private String defaultItemName;
	private String defaultItemDesc;
	//private Float itemPrice;
	public String getDefaultItemName() {
		return defaultItemName;
	}
	public void setDefaultItemName(String defaultItemName) {
		this.defaultItemName = defaultItemName;
	}
	public String getDefaultItemDesc() {
		return defaultItemDesc;
	}
	public void setDefaultItemDesc(String defaultItemDesc) {
		this.defaultItemDesc = defaultItemDesc;
	}
	
	
	
	

}
