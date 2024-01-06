package com.rentACar;

import java.util.*;

public class CarRentalService {

	private List<Car> allCars;

    public CarRentalService(List<Car> allCars) {
        this.allCars = allCars;
    }

    public List<Car> getAvailableCars(ICustomer customer) {
        List<Car> availableCars = new ArrayList<>();

        if ("individual".equals(customer.getCustomerType())) {
            // Bireysel müşterilere sadece Hatchback arabalar gösteriliyor
            for (Car car : allCars) {
                if (car instanceof Hatchback) {
                    availableCars.add(car);
                }
            }
        } else if ("company".equals(customer.getCustomerType())) {
            // Şirketlere tüm arabalar gösteriliyor
            availableCars.addAll(allCars);
        }

        return availableCars;
    }
	
}
