package com.hcl.demo;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Customer {

	@Id
	private int customerId;
	private String cutomerFirstname;
	private String customerLastname;
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(int customerId, String cutomerFirstname, String customerLastname) {
		super();
		this.customerId = customerId;
		this.cutomerFirstname = cutomerFirstname;
		this.customerLastname = customerLastname;
	}


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
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cutomerFirstname=" + cutomerFirstname + ", customerLastname="
				+ customerLastname + "]";
	}
	
	
	
}
