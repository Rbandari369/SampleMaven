package com.jhani.abstraction;

public abstract class Vehicle {
	
	private String make;
	private String model;
	private int year;
	
	public Vehicle(String make, String model,int year){
		this.make = make;
		this.model = model;
		this.year = year;
		
	}
	public void printCar(){
		System.out.println("The car is:"+ make+" "+model+" "+year);
	}
	
	

}
