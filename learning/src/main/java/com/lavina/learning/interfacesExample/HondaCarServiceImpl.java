package com.lavina.learning.interfacesExample;

public class HondaCarServiceImpl implements CarService {
	
	public void steeringCorrection(Car v) {
		System.out.println("Steering corrected for Honda Car");	
	}

	public void repairing(Vehicle v) {
		System.out.println("Process to get Honda Car Servicing");
		v.repair();
		System.out.println("Honda Car repair completed");
	}
}