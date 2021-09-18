package com.company.account;

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

    public Admin(){
        super(AccountType.ADMIN);
    }
}
