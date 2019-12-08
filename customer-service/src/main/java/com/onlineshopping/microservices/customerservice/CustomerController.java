package com.onlineshopping.microservices.customerservice;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	private Logger log = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	RabbitSendConfiguration rabbitSend;
	
	@Autowired
	EventProducer eventProducer;
				  
	@GetMapping("/service1/customers")
	public List<Customer> getCustomers() {
		log.info("Inside customer: Fetching Customer List");
		List<Customer> customersList = customerRepository.findAll();
		return customersList;
	}
	
	@PostMapping("/service1/customer")
	public void createCustomer(@RequestBody Customer customer) throws Exception {
		customerRepository.save(customer);
		eventProducer.produce(customer);
//		log.info("message sent",customer);
		
	}
		

}