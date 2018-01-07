package com.lavina.learning.interfacesExample;

public abstract class Vehicle {
	 
	protected String name;
	protected String company;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String company) {
		super();
		this.name = name;
		this.company = company;
	}
	
	public abstract void repair();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
}
