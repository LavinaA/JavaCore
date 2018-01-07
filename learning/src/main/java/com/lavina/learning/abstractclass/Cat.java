package com.lavina.learning.abstractclass;

public class Cat extends Animal {

	private boolean canPounce;
	
	public Cat() {
		
	}
	
	public Cat(int height, String name, boolean canPounce) {
		super(height,name);
		this.canPounce = canPounce;
	}
	
	public void makeNoise() {
		meow();
	}
	
	private void meow() {
		System.out.println("The cat meows");
	}
	
	public void method1(String s) {
    	System.out.println("From Cat Class - " + s);
    }

	public boolean isCanPounce() {
		return canPounce;
	}
	
	public void setCanPounce(boolean canPounce) {
		this.canPounce = canPounce;
	}
}
