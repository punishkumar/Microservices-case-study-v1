package com.onlineshopping.microservices.salesorderservice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="customer_sos")
public class CustomerSOS {
	
	@Id
	@Column(name="cust_id")
	private Long custId;
	@Column(name="cust_first_name")
	private String custFirstName;
	@Column(name="cust_last_name")
	private String custLastName;
	@Column(name="cust_email_id")
	private String custEmailId;
	
	public CustomerSOS() {}
	
	public CustomerSOS(@JsonProperty("custId") Long custId, @JsonProperty("firstName") String custFirstName,@JsonProperty("lastName") String custLastName,@JsonProperty("emailId") String custEmailId) {
		super();
		this.custId = custId;
		this.custFirstName = custFirstName;
		this.custLastName = custLastName;
		this.custEmailId = custEmailId;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustFirstName() {
		return custFirstName;
	}

	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}

	public String getCustLastName() {
		return custLastName;
	}

	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}

	public String getCustEmailId() {
		return custEmailId;
	}

	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}
	
	
	

}
