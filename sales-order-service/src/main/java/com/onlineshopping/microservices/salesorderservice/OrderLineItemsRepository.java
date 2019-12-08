package com.onlineshopping.microservices.salesorderservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemsRepository extends JpaRepository<OrderLineItems, Long> {

}
