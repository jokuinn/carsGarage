package com.reut.garage.data;

public class Truck extends Car{

    public Truck(String brand, String model, int year, String engineType, String transmissionType) {
        super(brand, model, year, engineType, transmissionType);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Brand: " + super.getBrand() + "\n" +
                "Model: " + super.getModel() + "\n" +
                "Year: " + super.getYear() + "\n" +
                "Type of engine: " + super.getEngineType() + "\n" +
                "Transmission: " + super.getTransmissionType() + "\n" +
                "Count ";
    }
}
