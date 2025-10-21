package com.arkx.garage.models;

import com.arkx.interfaces.Drivable;

public class Car extends Vehicle implements Drivable {

	public Car(String brand, String model, int year) {
		super(brand, model, year);
		
	}

	@Override
	public void start() {
		 System.out.println("Car is starting");
		
	}

	@Override
	public void accelerate() {
		System.out.println("Car is accelerating smoothly");
		
	}

	@Override
	public void brake() {
		System.out.println("Car is braking gently");
		
	}

	@Override
	public String getFuelType() {
		return "Diesel";
	}
	
	
	

}
