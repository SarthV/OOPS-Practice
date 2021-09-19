package com.company.account;

import com.company.ParkingComplex;
import com.company.ParkingFloor;
import com.company.ParkingSpot;

public class Admin extends Account {
    public ParkingFloor addParkingFloor(String floorName, ParkingComplex complex){
        complex.addParkingFloor(floorName);
        ParkingFloor parkingFloor = complex.getParkingFloor(floorName);
        return parkingFloor;
    }

    public ParkingSpot createParkingSpot(ParkingFloor floor, int num){
        ParkingSpot spot = new ParkingSpot(num);
        spot.setNum(num);
        floor.addParkingSpot(spot);
        return spot;
    }

    public ParkingComplex createNewParkingComplex(String name){
        ParkingComplex complex = new ParkingComplex(name);
        return complex;
    }

    public Admin(){
        super(AccountType.ADMIN);
    }
}
