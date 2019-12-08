package com.onlineshopping.microservices.salesorderservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerSOSRepository extends JpaRepository<CustomerSOS, Long> {

}
