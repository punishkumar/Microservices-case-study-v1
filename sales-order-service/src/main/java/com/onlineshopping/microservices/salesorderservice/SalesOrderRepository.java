package com.onlineshopping.microservices.salesorderservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SalesOrderRepository extends JpaRepository<SalesOrder, Long> {

}
