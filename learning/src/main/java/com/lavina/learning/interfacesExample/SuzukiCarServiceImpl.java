package com.lavina.learning.interfacesExample;

public class SuzukiCarServiceImpl implements CarService {
	
public void steeringCorrection(Car v) {
	System.out.println("Steering corrected for Suzuki Car");	
	}

	public void repairing(Vehicle v) {
		System.out.println("Process to get Suzuki Car Servicing");
		v.repair();
		System.out.println("Suzuki Car repair completed");
	}

}
