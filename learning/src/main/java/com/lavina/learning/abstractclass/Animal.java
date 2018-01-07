package com.lavina.learning.abstractclass;

public abstract class Animal {
	
	private int height;
    private String name;
    
    public Animal() {
    	
    }
    
    public Animal(int height, String name) {
    	this.height = height;
    	this.name = name;
    }
    
    public void method1(String s) {
    	System.out.println("From Animal Class - " + s);
    }
    
    public abstract void makeNoise() ;
    	
    public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

