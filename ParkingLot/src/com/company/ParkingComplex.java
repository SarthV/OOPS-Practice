package com.company;

import java.util.HashMap;

public class ParkingComplex {
    private String name;
    private HashMap<String, ParkingFloor> parkingFloors = new HashMap<>();

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

    public ParkingFloor getParkingFloor(String floorName) throws IllegalArgumentException{
        if(parkingFloors.containsKey(floorName)){
            return parkingFloors.get(floorName);
        }
        else{
            throw new IllegalArgumentException("No such floor exists!");
        }
    }
}
