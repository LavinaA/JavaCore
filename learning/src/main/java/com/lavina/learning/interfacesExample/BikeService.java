package com.lavina.learning.interfacesExample;

public interface BikeService extends VehicleService {
	
	public void handleCorrection(Bike v); //by default the method is abstract and needs to be implemented

}
