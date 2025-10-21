package com.arkx.garage.models;

import java.time.Year;

import com.arkx.interfaces.Drivable;
import com.arkx.interfaces.Serviceable;

public class Truck extends Vehicle implements Drivable, Serviceable {
	

	public Truck(String brand, String model, int year) {
		super(brand, model, year);
		
	}
	
	@Override
	public void start() {
        System.out.println("Truck is starting");
	}

	@Override
	public void accelerate() {
        System.out.println("Truck is accelerating smoothly");
		
	}

	@Override
	public void brake() {
        System.out.println("Truck is braking gently");
		
	}

	@Override
	public String getFuelType() {
		return "Diesel";
	}

	@Override
	public void performService() {
		System.out.println("Truck is being serviced");
	}

	@Override
	public boolean needsService() {
		int currentYear = Year.now().getValue();
        return (currentYear - getYear()) > 5;
	}
	
	

}
