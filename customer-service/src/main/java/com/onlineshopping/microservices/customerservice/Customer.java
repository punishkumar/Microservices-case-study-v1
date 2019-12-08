package com.onlineshopping.microservices.customerservice;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Customer implements Serializable {
	
	@Id
	@Column(name="cust_id")
	private Long custId;
	@Column(name="email_id")
	private String emailId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	
	public Customer() {}
	
	public Customer(@JsonProperty("custId") Long custId, @JsonProperty("emailId") String emailId, @JsonProperty("firstName") String firstName,@JsonProperty("lastName") String lastName) {
		super();
		this.custId = custId;
		this.emailId = emailId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	
	

}
