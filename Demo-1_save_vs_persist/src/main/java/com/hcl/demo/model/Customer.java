package com.hcl.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;		

@Entity
public class Customer {

	@Id
	private int customerId;
	private String cutomerFirstname;
	private String customerLastname;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCutomerFirstname() {
		return cutomerFirstname;
	}
	public void setCutomerFirstname(String cutomerFirstname) {
		this.cutomerFirstname = cutomerFirstname;
	}
	public String getCustomerLastname() {
		return customerLastname;
	}
	public void setCustomerLastname(String customerLastname) {
		this.customerLastname = customerLastname;
	}
	
	
	
}
