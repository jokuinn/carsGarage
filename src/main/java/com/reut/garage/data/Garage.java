package com.reut.garage.data;

import java.util.HashMap;
import java.util.Map;

public class Garage {
    public Map<Car, Integer> cars = new HashMap<>();

    public void parking(Car car){
        if (cars.containsKey(car)){
            cars.put(car, cars.get(car) + 1);
        } else {
            cars.put(car, 1);
        }
        System.out.println(car.getBrand() + " " + car.getModel() + " in garage.");

    }

    public void exitFromGarage(Car car){
        for (Map.Entry<Car, Integer> entryCar: cars.entrySet()){
            if (entryCar.getKey().getModel().equals(car.getModel())){
                cars.put(car, cars.get(car) - 1);
                System.out.println(car.getBrand() + " " + car.getModel() + " left the garage.");
            }
        }
    }

    public void showCountCar(Car car){
        for (Map.Entry<Car, Integer> entryCar: cars.entrySet()){
           if (entryCar.getKey().getModel().equals(car.getModel())){
               System.out.println("Count of " + car.getModel() + " is " + entryCar.getValue());
           }
        }
    }
}
