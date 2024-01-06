package com.rentACar;

import java.util.*;

public class RentalCostTest {

	public static void main(String[] args) {
		Sedan sedan = new Sedan(15, "Black", 400, "LPG", 100000, "Manual");
        Hatchback hatchback = new Hatchback(10, "Red", 300, "Gasoline", 70000, "Semi-Automatic");
        SUV suv = new SUV(5, "Blue", 500, "Hybrid", 40000, "Automatic");
        SUV suv2 = new SUV(11, "White", 450, "Diesel", 110000, "Automatic");

        System.out.println("Total amount: " + sedan.calculateDailyRentalCost(5));
        System.out.println("Total amount: " + hatchback.calculateDailyRentalCost(7));
        System.out.println("Total amount: " + suv.calculateDailyRentalCost(10));
        System.out.println("Total amount: " + suv2.calculateDailyRentalCost(10));
        
        System.out.println("Total amount: " + sedan.calculateMonthlyRentalCost(1));
        System.out.println("Total amount: " + hatchback.calculateMonthlyRentalCost(2));        
        
	}	
	
}
