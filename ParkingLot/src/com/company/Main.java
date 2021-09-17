package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ParkingLot lot = new ParkingLot();
        ParkingSpace[][] parkingLotCopy = lot.initializeLot();
        lot.printLot();
    }
}
