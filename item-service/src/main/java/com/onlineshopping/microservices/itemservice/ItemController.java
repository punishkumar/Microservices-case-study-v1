package com.onlineshopping.microservices.itemservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@EnableHystrix
public class ItemController {
	
	Logger log = LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	ItemRepository itemRepository;
	
	@Autowired
	ItemConfig itemConfig;
	
	@GetMapping("/service2/items")
	public List<Item> getItems() {
	
		//return new Customer(1234L,"abc@xyz.com","Glen","Max");
		List<Item> itemsList = itemRepository.findAll();
		return itemsList;
	
	}
	
	@GetMapping("/service2/items/{itemName}")
	@HystrixCommand(fallbackMethod="fallBackItemDetails")
	public Item getItemDetails(@PathVariable("itemName") String itemName) {
		log.info("Inside Items: Fetching the Item Details");
		//return new Customer(1234L,"abc@xyz.com","Glen","Max");
		Item itemdetail = itemRepository.findByItemName(itemName);
		if (itemdetail != null)			
		return itemdetail;
		else
		throw new RuntimeException("Item not found");
	}
	
	public Item fallBackItemDetails(String item) {
		return new Item(999999999L,itemConfig.getItemName(),itemConfig.getItemDesc(),0.00F);
	}

}
