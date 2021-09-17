package com.company;

import com.company.vehicle.Vehicle;

public class RealDeal {
    final static int n = 5;
    static ParkingSpace[][] parkingLot = new ParkingSpace[n][n];

    public static void startTheLot(){
        for(int i = 0 ; i  < n ; i++){
            for(int j = 0 ;  j < n ; j++) {
                parkingLot[i][j] = new ParkingSpace();
            }
        }
        ParkingLot.printLot(parkingLot);
        System.out.println("Started the Parking Lot");
    }

    public static boolean checkAndInsert(int row, int col, Vehicle vehicle) throws IllegalArgumentException{
        if(row < 0 || row >= n || col < 0 || col >= n){
            throw new IllegalArgumentException("Invalid Cell");
        }
        ParkingSpace space = parkingLot[row][col];
        if(!space.isEmpty()){
            throw new IllegalArgumentException("Already occupied");
        }
        else{
            space.setEmpty(false);
            space.setVehicle(vehicle);
            System.out.println("Vehicle added : ");
            ParkingLot.printLot(parkingLot);
            return true;
        }
    }

    public static boolean removeVehicle(int row, int col, Vehicle vehicle) throws IllegalArgumentException{
        if(row < 0 || row >= n || col < 0 || col >= n){
            throw new IllegalArgumentException("Invalid Cell");
        }
        ParkingSpace space = parkingLot[row][col];
        if(space.isEmpty()){
            throw new IllegalArgumentException("Empty Cell!");
        }
        if(space.getVehicle() != vehicle){
            throw new IllegalArgumentException("Not your vehicle");
        }
        else{
            space.setEmpty(true);
            space.setVehicle(new Vehicle());
            System.out.println("Vehicle removed : ");
            ParkingLot.printLot(parkingLot);
            return true;
        }
    }
}
