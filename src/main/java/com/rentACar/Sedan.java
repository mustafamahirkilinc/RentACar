package com.rentACar;

public class Sedan extends Car implements IDailyRentable, IMonthlyRentable, ICustomer {

	public Sedan(int age, String color, int baggageCapacity, String fuelType, int km, String transmissionType) {
		super(age, color, baggageCapacity, fuelType, km, transmissionType);
	}

	@Override
	public double calculateDailyRentalCost(int day) {
		return day*300;
	}
	
	@Override
	public double calculateMonthlyRentalCost(int month) {
		return month*30*300;
	}

	@Override
	public String getCustomerType() {
		return getCustomerType();
	}	
	
}
