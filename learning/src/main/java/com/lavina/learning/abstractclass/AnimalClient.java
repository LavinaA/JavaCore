package com.lavina.learning.abstractclass;

public class AnimalClient {

	public static void main(String[] args) {

		Animal a1 = new Dog(5,"Tommy",Boolean.TRUE);
		Animal a2 = new Cat(3,"Kitty",Boolean.TRUE);
		Dog d1 = new Dog(3,"Tiger",Boolean.FALSE);
		Cat c1 = new Cat(1,"Pussy",Boolean.FALSE);
		
		System.out.println("Calling maekNoise...");
		a1.makeNoise();
		a1.method1("Called on Dog object using Animal holder");
		System.out.println();
		
		System.out.println("Calling maekNoise...");
		a2.makeNoise();
		a2.method1("Called on Cat object using Animal holder");
		System.out.println();
		
		System.out.println("Calling maekNoise...");
		d1.makeNoise();
		d1.method1("Called on Dog object using Dog holder");
		System.out.println();
		
		System.out.println("Calling maekNoise...");
		c1.makeNoise();
		c1.method1("Called on Cat object using Cat holder");
	}
	
}
