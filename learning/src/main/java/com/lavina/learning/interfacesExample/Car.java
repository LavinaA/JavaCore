package com.lavina.learning.interfacesExample;

public class Car extends Vehicle {
	
	private boolean powerSteering;
	
	public Car() {
		
	}

	public Car(String name, String company, boolean powerSteering) {
		super(name, company);
		this.powerSteering = powerSteering;
	}
	
	public void repair() {
		System.out.println("Car Name= " + this.name);
		System.out.println("Car Company = " + this.company);
		System.out.println("Car is Powersteering = " +this.powerSteering);
	}

	public boolean isPowerSteering() {
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) {
		this.powerSteering = powerSteering;
	}
	
}
