package com.arkx.garage.models;

import com.arkx.garage.interfaces.Drivable;

public class Motorcycle
 extends Vehicle implements Drivable {

	public Motorcycle(String brand, String model, int year) {
		super(brand, model, year);
		
	}

	@Override
	public void start() {
		System.out.println("Motorcycle is starting");
	}

	@Override
	public void accelerate() {
		System.out.println("Motorcycle is accelerate smoothly");
		
	}

	@Override
	public void brake() {
		System.out.println("Motorcycle is braking gently");
		
	}

	@Override
	public String getFuelType() {
		 return "Gasoline";
	}
	
	

}
