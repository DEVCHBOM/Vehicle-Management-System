package com.arkx.garage.models;

public abstract class Vehicle {
	
	private String brand;

	private String model;

	private int year;
	
	public Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	
	public void displayInfo() {
		System.out.println("Brand = " + brand + "\nModel = " + model + "\nYear = " + year);
	}
	
	public abstract String getFuelType();

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	

}
