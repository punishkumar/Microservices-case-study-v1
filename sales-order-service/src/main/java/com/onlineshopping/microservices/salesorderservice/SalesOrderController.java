package com.onlineshopping.microservices.salesorderservice;

import java.io.Serializable;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesOrderController {
	
	private Logger log = LoggerFactory.getLogger(SalesOrderController.class);
		
	@Autowired
	OrderLineItemsRepository orderLineItemsRepository;
	@Autowired
	CustomerSOSRepository customerSOSRepository;
	@Autowired
	SalesOrderRepository salesOrderRepository;
	
	@Autowired
	ItemService itemService;
	
	@Autowired
	SalesOrder salesOrder;
	
//	@Autowired
//	OrderLineItems lineItems;

	Long lineItemId = 0000000001L;
	Long orderId = 0000000000L;
	Long salesOrderId = 0000000000L;
	
//	@RabbitListener(queues="customerInfoQueue")
//	public void receiveMessage(CustomerSOS cust) {
//		log.info("Received Message ", cust.getCustId());
//		log.info("Received Message '{}'",cust.getCustEmailId());
//		log.info("Received Message '{}'",cust.getCustFirstName());
//		log.info("Received Message '{}'",cust.getCustLastName());
//	}
	
	
	
	@PostMapping("/service3/orders")
	public Long createOrder(@RequestBody InputOrder order) {
		
		log.info("Inside SalesOrder: Loading Order");
		//Validate Customer from customerSOS table
		
		customerSOSRepository.findById(order.getCustId());
		
		
		//Validate Item names from Item table
		
		ArrayList<String> lineItemsNames=new ArrayList<String>(); 
		order.getLineItems().stream().forEach(itemNames -> { 
		lineItemsNames.add(itemNames.getItemName());
		});
		
		for(String name:lineItemsNames) {
		itemService.getItemDetails(name);
		log.info(name);
		}
		
		
		//Creating Sales Order entry in Sales Order Table
		 salesOrderId = salesOrderId+1;
		 
		 salesOrder.setSalesOrderId(salesOrderId);
		 salesOrder.setCustId(order.getCustId());
		 salesOrder.setOrderDate(order.getOrderDate());
		 salesOrder.setOrderDesc(order.getOrderDesc());
		 salesOrder.setTotalPrice(255.6F);
		
		 salesOrderRepository.save(salesOrder);
		
		 
		 //Creating Line Items entries in OrderLineItems table
		 
		 orderId=orderId+1;
		
		 order.getLineItems()
			 //.stream()
			 .forEach(item -> {
				 orderLineItemsRepository.save(new OrderLineItems(lineItemId++,item.getItemName(),item.getItemQty(),orderId));
		 });
			
		
		 return orderId;
		
	}
	

}