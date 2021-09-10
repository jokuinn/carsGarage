package com.reut.garage.data;

public abstract class Car {
    private final String brand;
    private final String model;
    private final int year;

    private final String engineType;
    private final String transmissionType;

    public Car(String brand, String model, int year, String engineType, String transmissionType){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.engineType = engineType;
        this.transmissionType = transmissionType;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

}
