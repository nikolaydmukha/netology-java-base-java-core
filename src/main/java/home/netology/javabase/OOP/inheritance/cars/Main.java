package main.java.home.netology.javabase.OOP.inheritance.cars;

import main.java.home.netology.javabase.OOP.inheritance.cars.bodytype.Pickup;
import main.java.home.netology.javabase.OOP.inheritance.cars.bodytype.Sedan;
import main.java.home.netology.javabase.OOP.inheritance.cars.fueltype.Diesel;
import main.java.home.netology.javabase.OOP.inheritance.cars.fueltype.Petrol;
import main.java.home.netology.javabase.OOP.inheritance.cars.purposetype.Car;
import main.java.home.netology.javabase.OOP.inheritance.cars.purposetype.Passenger;
import main.java.home.netology.javabase.OOP.inheritance.cars.purposetype.Truck;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new Passenger(), new Sedan(), new Petrol());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new Truck(), new Pickup(), new Diesel());

        //Make filter
        adsService.setAdList(new VehicleAd[] {volvoAd, kamazAd});
        adsService.filterByVehicleTypeByPurpose(new Passenger());
        adsService.filterByVehicleTypeByPurpose(new Truck());

        //TODO Создайте объявление с типами CAR, SEDAN, PETROL и отфильтруйте объявления с бензиновым топливом
        VehicleAd mercedesAd = new VehicleAd("Mercedes", "145", new Car(), new Sedan(), new Petrol());
        VehicleAd bmwAd = new VehicleAd("BMW", "245", new Car(), new Sedan(), new Diesel());

        //Make filter
        adsService.setAdList(new VehicleAd[] {mercedesAd, bmwAd});
        adsService.filterByVehicleTypeByFuelTypes(new Petrol());
    }
}
