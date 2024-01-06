package com.rentACar;

public class SUV extends Car implements IDailyRentable, ICustomer {

	public SUV(int age, String color, int baggageCapacity, String fuelType, int km, String transmissionType) {
		super(age, color, baggageCapacity, fuelType, km, transmissionType);
	}
	
	@Override
	public double calculateDailyRentalCost(int day) {
		if(getAge()<=10) {
			return day*400;
		}
		else {
			return day*350;
		}
	}

	@Override
	public String getCustomerType() {
		return getCustomerType();
	}	
	
}
