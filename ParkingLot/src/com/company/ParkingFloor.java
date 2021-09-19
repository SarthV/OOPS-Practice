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

    public void assignVehicleToSpace(ParkingSpot spot, Vehicle vehicle, String inTime) throws IllegalAccessError{
        if(numberOfFreeSpots <= 0){
            throw new IllegalAccessError("No free spots here!");
        }
        ParkingTicket ticket = new ParkingTicket();
        ticket.setInTime(inTime);
        vehicle.assignTicket(ticket);
        spot.setVehicle(vehicle);
        numberOfFreeSpots--;
    }

    public void removeVehicleFromSpot(ParkingSpot spot, String outTime){
        Vehicle vehicle = spot.getVehicle();
        ParkingTicket ticket = vehicle.getTicket();
        ticket.setOutTime(outTime);
        spot.removeVehicle();
        numberOfFreeSpots++;
    }

}
