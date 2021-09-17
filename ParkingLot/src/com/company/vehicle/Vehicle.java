package com.company.vehicle;

public class Vehicle {
    Type vehicleType;

    public String getModel() {
        return model;
    }

    String model;

    public Vehicle(){
        model = "N/A";
        vehicleType = Type.EMPTY;
    }

    public  Vehicle(String model, Type vehicleType){
        this.model = model;
        this.vehicleType = vehicleType;
    }
}
