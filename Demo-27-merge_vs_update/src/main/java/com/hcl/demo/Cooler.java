package com.hcl.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cooler {

	@Id
	private int coolerId;
	private String coolerName;
	
	public int getCoolerId() {
		return coolerId;
	}
	public void setCoolerId(int coolerId) {
		this.coolerId = coolerId;
	}
	public String getCoolerName() {
		return coolerName;
	}
	public void setCoolerName(String coolerName) {
		this.coolerName = coolerName;
	}
	
	@Override
	public String toString() {
		return "Cooler [coolerId=" + coolerId + ", coolerName=" + coolerName + "]";
	}
	
	
}
