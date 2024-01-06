package com.rentACar;

import java.util.*;

public class CustomerTest {

	public static void main(String[] args) {
    	// Araba listesi
   	    List<Car> allCars = new ArrayList<>();
        allCars.add(new Sedan(15, "Black", 400, "LPG", 100000, "Manual"));
        allCars.add(new Hatchback(10, "Red", 300, "Gasoline", 70000, "Semi-Automatic"));
        allCars.add(new SUV(5, "Blue", 500, "Hybrid", 40000, "Automatic"));
        allCars.add(new Sedan(3, "White", 450, "Gasoline", 30000, "Manual"));
        allCars.add(new Hatchback(7, "Gray", 350, "Diesel", 50000, "Automatic"));
        allCars.add(new SUV(1, "Yellow", 550, "Electric", 10000, "Automatic"));
        
        // Kullanıcıdan müşteri tipi alınıyor (Bireysel veya Şirket)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you an individual customer or a company customer? Enter 'individual' or 'company': ");
        String customerType = scanner.nextLine().toLowerCase();
        
        // Kullanıcı tipine göre uygun müşteri nesnesi oluşturuluyor
        ICustomer customer;
        if ("individual".equals(customerType)) {
            customer = new IndividualCustomer();
        } 
        else if ("company".equals(customerType)) {
            customer = new CompanyCustomer();
        } 
        else {
            System.out.println("Invalid entry.");
            return;
        }
        
        // CarRentalService sınıfını kullanarak uygun araçlar getiriliyor
        CarRentalService carRentalService = new CarRentalService(allCars);
        List<Car> availableCars = carRentalService.getAvailableCars(customer);

        System.out.println("Available cars for " + customerType + " customer:");
        printCarList(availableCars);
	}
	
    private static void printCarList(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getClass().getSimpleName() + ": Age: " + car.getAge() + ", Color: " + car.getColor() + ", BaggaceCapacity: " 
            		+ car.getBaggageCapacity() + ", FuelType: " + car.getFuelType() + ", Km: " + car.getKm() + ", TransmissionType: " + car.getTransmissionType());
        }
    }
	
}
