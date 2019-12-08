package com.onlineshopping.microservices.salesorderservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name="zuul-service")
@RibbonClient(name="customer-service")
public interface CustomerService {
	
	

}
