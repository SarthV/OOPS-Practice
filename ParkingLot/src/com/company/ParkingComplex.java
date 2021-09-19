package com.company;

import java.util.HashMap;

public class ParkingComplex {
    String name;
    HashMap<String, ParkingFloor> parkingFloors = new HashMap<>();

    public ParkingComplex(){

    }

    public ParkingComplex(String name){
        this.name = name;
    }

    public void addParkingFloor(String floorName){
        ParkingFloor floor = new ParkingFloor();
        floor.setFloorName(floorName);
        parkingFloors.put(floorName, floor);
    }
}
