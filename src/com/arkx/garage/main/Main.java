package com.arkx.garage.main;

import java.util.ArrayList;
import java.util.List;

import com.arkx.garage.models.Car;
import com.arkx.garage.models.Motorcycle;
import com.arkx.garage.models.Truck;
import com.arkx.garage.models.Vehicle;
import com.arkx.interfaces.Drivable;
import com.arkx.interfaces.Serviceable;

public class Main {
	
	public static void main(String[] args) {
		
		List<Vehicle> vehicles =  new ArrayList<Vehicle>();
        vehicles.add(new Car("BMW", "Serie 3", 2016));
        vehicles.add(new Motorcycle("Kawasaki ", "Ninja H2R", 2020));
        vehicles.add(new Truck("Volvo", "FH16", 2016));
        vehicles.add(new Truck("Mercedes", "Actros", 2024));
        
        
        for (Vehicle vehicle : vehicles) {
			System.out.println("_______________________________________");

			vehicle.displayInfo();
			vehicle.getFuelType();
			
			((Drivable) vehicle).start();
			((Drivable) vehicle).accelerate();
			((Drivable) vehicle).brake();
				
			if (vehicle instanceof Serviceable ) {
                if (((Serviceable) vehicle).needsService()) {
                    System.out.println("This vehicle needs service.");
                    ((Serviceable) vehicle).needsService();
                } else {
                    System.out.println("This vehicle is in good condition.");
                }
            }
			System.out.println("_______________________________________");
			
		}

		
	}

}
