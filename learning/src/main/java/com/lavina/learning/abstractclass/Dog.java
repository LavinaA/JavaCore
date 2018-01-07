package com.lavina.learning.abstractclass;

public class Dog extends Animal {
	
	private boolean canBite;
	
	public Dog() {
		
	}
	
	public Dog(int height, String name, boolean canBite ) {
		super(height, name);
		this.canBite = canBite;
	}
	
	private void bark() {
		System.out.println("The Dog barks");
	}
	
	public void method1(String s) {
    	System.out.println("From Dog Class - " + s);
    }
	
	public void makeNoise() {
		this.bark();
	}

	public boolean isCanBite() {
		return canBite;
	}

	public void setCanBite(boolean canBite) {
		this.canBite = canBite;
	}
}
