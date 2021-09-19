package com.company.vehicle;

import com.company.ParkingTicket;

public abstract class Vehicle {
    Type vehicleType;
    String model;
    ParkingTicket ticket;

    public void setVehicleType(Type vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Type getVehicleType() {
        return vehicleType;
    }
    public String getModel() {
        return model;
    }

    public void assignTicket(ParkingTicket ticket){
        this.ticket = ticket;
    }

    public ParkingTicket getTicket(){
        return ticket;
    }

    public Vehicle(){
        model = "N/A";
        vehicleType = Type.EMPTY;
    }

    public Vehicle(String model, Type type){
        this.model = model;
        this.vehicleType = type;
    }

    public Vehicle(Type vehicleType){
        this.vehicleType = vehicleType;
    }
}
