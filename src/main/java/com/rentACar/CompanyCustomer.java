package com.rentACar;

public class CompanyCustomer implements ICustomer{

    private String customerType = "company";

    @Override
    public String getCustomerType() {
        return customerType;
    }
	
}
