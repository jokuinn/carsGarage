package com.reut.garage;

import com.reut.garage.data.*;

import java.util.Map;

public class Main {
    public static Garage garage = new Garage();
    public static final Car audiA3 = new Sedan("Audi", "A3", 2021, "disel", "automatic");
    public static final Car mercedesBenz = new SuperCar("Mercedes-Benz", "SLS AMG", 2010, "petrol", "manual");
    public static final Car alfaRomeoSpider = new Roadster("Alfa Romeo", "Spider", 1993, "petrol", "automatic");
    public static final Car cascadia = new Truck("Freightliner", "Cascadia", 2008, "disel", "automatic");


    public static void main(String[] args) {
        fillGarage();
        showCarsInGarage();
        getCarFromGarage();
        showCarsInGarage();
        showCountCar();
    }

    public static void fillGarage(){
        garage.parking(audiA3);
        garage.parking(audiA3);
        garage.parking(mercedesBenz);
        garage.parking(alfaRomeoSpider);
        garage.parking(cascadia);
        garage.parking(cascadia);
    }

    public static void getCarFromGarage(){
        garage.exitFromGarage(audiA3);
    }

    public static void showCountCar(){
        garage.showCountCar(audiA3);
    }

    public static void showCarsInGarage(){
        for (Map.Entry<Car, Integer> entryCar: garage.cars.entrySet()){
            System.out.println("\n" + entryCar + "\n");
        }
    }
}
