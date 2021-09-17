package com.company;

import com.company.vehicle.Vehicle;

public class ParkingSpace {
    boolean isEmpty = true;
    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    Vehicle vehicle = new Vehicle();
    public ParkingSpace(){
    }
}
