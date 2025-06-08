package com.hcl.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "house")
@Table(name = "home_table")
public class Home {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Home [id=" + id + ", price=" + price + "]";
	}
	
	
	
	
}
