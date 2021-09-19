package com.company.account;

import com.company.ParkingComplex;
import com.company.ParkingFloor;
import com.company.ParkingSpot;

public class Admin extends Account {
    public ParkingFloor addParkingFloor(){
        ParkingFloor parkingFloor = new ParkingFloor();
        return parkingFloor;
    }

    public ParkingSpot createParkingSpot(int num){
        ParkingSpot spot = new ParkingSpot(num);
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
