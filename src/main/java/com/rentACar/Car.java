package com.rentACar;

public class Car {

	private int age;
	private String color;
	private int baggageCapacity;
	private String fuelType;
	private int km;
	private String transmissionType;
	
	public Car(int age, String color, int baggageCapacity, String fuelType, int km, String transmissionType) {
		this.age = age;
		this.color = color;
		this.baggageCapacity = baggageCapacity;
		this.fuelType = fuelType;
		this.km = km;
		this.transmissionType = transmissionType;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBaggageCapacity() {
		return baggageCapacity;
	}

	public void setBaggageCapacity(int baggageCapacity) {
		this.baggageCapacity = baggageCapacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}	
	
}
