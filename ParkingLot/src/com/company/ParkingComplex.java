package com.company;

import java.util.HashMap;

public class ParkingComplex {
    String name;
    HashMap<String, ParkingFloor> parkingFloors;

    public void addParkingFloor(String floorName){
        ParkingFloor floor = new ParkingFloor();
        floor.setFloorName(floorName);
        parkingFloors.put(floorName, floor);
    }
}
