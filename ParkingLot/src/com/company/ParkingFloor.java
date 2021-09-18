package com.company;

import com.company.vehicle.Vehicle;
import java.util.HashMap;

public class ParkingFloor {
    private String floorName;
    private HashMap<Integer, ParkingSpot> spotsOnThisFloor = new HashMap<>();
    private int numberOfFreeSpots = 0;

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public int getNumberOfFreeSpots() {
        return numberOfFreeSpots;
    }

    public ParkingFloor(){
    }

    public void addParkingSpot(ParkingSpot spot){
        spotsOnThisFloor.put(spot.getNum(), spot);
        numberOfFreeSpots++;
    }

    public void assignVehicleToSpace(ParkingSpot spot, Vehicle vehicle) throws IllegalAccessError{
        if(numberOfFreeSpots <= 0){
            throw new IllegalAccessError("No free spots here!");
        }
        spot.setVehicle(vehicle);
        numberOfFreeSpots--;
    }

    public void removeVehicleFromSpot(ParkingSpot spot){
        spot.removeVehicle();
        numberOfFreeSpots++;
    }

}
