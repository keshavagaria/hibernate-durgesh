package com.hcl.demo;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;

@Entity
public class Person {

	@Id
	private int id;
	private String name;
	
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "THE_PERSON_ADDRESS",
						joinColumns = @JoinColumn(name="THE_PERSON_ID"))
	private List<Address> addresses;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
	}

	
	
	
}
