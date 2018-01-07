package com.lavina.learning.interfacesExample;

public class VehicleServiceClient {

	public static void main(String[] args) {
		CarService hondaCarService = new HondaCarServiceImpl();
		CarService suzukiCarService = new SuzukiCarServiceImpl();
		BikeService hondaBikeService = new HondaBikeServiceImpl();
		BikeService suzukiBikeService = new SuzukiBikeServiceImpl();
		
		Vehicle c1 = new Car("Citi","Honda",Boolean.TRUE);
		Vehicle c2 = new Car("800","Suzuki",Boolean.FALSE);
		Vehicle b1 = new Bike("CBZ","Honda",Boolean.TRUE);
		Vehicle b2 = new Bike("Samurai","Suzuki",Boolean.FALSE);
		
		hondaCarService.repairing(c1);
		hondaCarService.steeringCorrection((Car)c1);
		suzukiCarService.repairing(c2);
		suzukiCarService.steeringCorrection((Car)c2);
		
		hondaBikeService.repairing(b1);
		hondaBikeService.handleCorrection((Bike)b1);
		suzukiBikeService.repairing(b2);
		suzukiBikeService.handleCorrection((Bike)b2);
		
	}

}
