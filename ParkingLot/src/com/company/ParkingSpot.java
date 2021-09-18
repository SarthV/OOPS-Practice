package com.company;

import com.company.vehicle.Type;
import com.company.vehicle.Vehicle;

public class ParkingSpot {
    boolean isEmpty = true;
    Vehicle vehicle;
    Type spaceType = Type.CAR;
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

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

    public Type getSpaceType() {
        return spaceType;
    }

    public  ParkingSpot(int num){
        this.num = num;
    }

    public ParkingSpot(){

    }

    public void removeVehicle(){
        this.isEmpty = true;
        this.vehicle = null;
    }
}
