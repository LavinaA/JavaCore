package com.lavina.learning.interfacesExample;

public class SuzukiBikeServiceImpl implements BikeService {

	public void handleCorrection(Bike v) {
		System.out.println("Handle corrected for Suzuki Bike");
	}

	public void repairing(Vehicle v) {
		System.out.println("Process to get Honda Bike Servicing");
		v.repair();
		System.out.println("Honda Bike repair completed");
	}

}
