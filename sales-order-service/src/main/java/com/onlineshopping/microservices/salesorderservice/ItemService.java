package com.onlineshopping.microservices.salesorderservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="item-service",url="localhost:8222")
@FeignClient(name="zuul-gateway")
@RibbonClient(name="item-service")
public interface ItemService {
	
	@GetMapping("/item-service/service2/items/{itemName}")
	public String getItemDetails(@PathVariable("itemName") String itemName);

}
