package com.reut.garage.data;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int result = engineType.hashCode();
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(engineType, car.engineType);
    }
}
