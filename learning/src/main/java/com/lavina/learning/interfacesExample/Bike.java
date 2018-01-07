package com.lavina.learning.interfacesExample;

public class Bike extends Vehicle {
	
	private boolean moped;

	public Bike() {

	}

	public Bike(String name, String company, boolean moped) {
		super(name, company);
		this.moped = moped;
	}
	
	public void repair() {
		System.out.println("Bike Name= " + this.name);
		System.out.println("Bike Company = " + this.company);
		System.out.println("Bike is Moped" +this.moped);
	}

	public boolean isMoped() {
		return moped;
	}

	public void setMoped(boolean moped) {
		this.moped = moped;
	}
}
