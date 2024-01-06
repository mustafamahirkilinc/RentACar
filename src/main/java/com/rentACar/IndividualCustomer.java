package com.rentACar;

public class IndividualCustomer implements ICustomer {

    private String customerType = "individual";

    @Override
    public String getCustomerType() {
        return customerType;
    }	
	
}
