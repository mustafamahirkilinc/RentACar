package com.rentACar;

public class Hatchback extends Car implements IDailyRentable, IMonthlyRentable, ICustomer {

	public Hatchback(int age, String color, int baggageCapacity, String fuelType, int km, String transmissionType) {
		super(age, color, baggageCapacity, fuelType, km, transmissionType);
	}

	@Override
	public double calculateDailyRentalCost(int day) {
		return day*250;
	}

	@Override
	public double calculateMonthlyRentalCost(int month) {
		return month*30*250;
	}

	@Override
	public String getCustomerType() {
		return getCustomerType();
	}	
	
}
