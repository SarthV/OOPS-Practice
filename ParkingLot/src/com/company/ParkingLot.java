package com.company;

import com.company.vehicle.Vehicle;

public class ParkingLot {
    ParkingSpace[][] parkingLot;
    final static int n = 5;
    public ParkingSpace[][] initializeLot(){
        parkingLot = new ParkingSpace[n][n];
        for(ParkingSpace[] row : parkingLot){
            for(ParkingSpace col : row) {
                col = new ParkingSpace();
            }
        }
        return parkingLot;
    }
    public void printLot(){
        for(ParkingSpace[] row : parkingLot){
            for(ParkingSpace col : row) {
                System.out.print("_ ");
            }
            System.out.println();
        }
    }

    public boolean checkAndInsert(int row, int col, Vehicle vehicle) throws IllegalArgumentException{
        if(row < 0 || row >= n || col < 0 || col >= 50){
            throw new IllegalArgumentException("Invalid Cell");
        }
        ParkingSpace space = parkingLot[row][col];
        if(!space.isEmpty()){
            throw new IllegalArgumentException("Already occupied");
        }
        else{
            space.setEmpty(false);
            space.setVehicle(vehicle);
            return true;
        }
    }

    public boolean removeVehicle(int row, int col, Vehicle vehicle) throws IllegalArgumentException{
        if(row < 0 || row >= n || col < 0 || col >= 50){
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
            return true;
        }
    }
}
