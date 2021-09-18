package com.company;

import com.company.vehicle.Vehicle;

public class ParkingLot{
    final static int n = 5;
    public static ParkingSpot[][] initializeLot(int n){
        ParkingSpot[][] parkingLot = new ParkingSpot[n][n];
        for(int i = 0 ; i  < n ; i++){
            for(int j = 0 ;  j < n ; j++) {
                parkingLot[i][j] = new ParkingSpot();
            }
        }
        return parkingLot;
    }
    public static void printLot(ParkingSpot[][] parkingLot){
        for(ParkingSpot[] row : parkingLot){
            for(ParkingSpot col : row) {
                if(col.isEmpty())System.out.print("_ ");
                else{
                    System.out.print(col.getVehicle().getModel().charAt(0));
                }
            }
            System.out.println();
        }
    }
    public static boolean checkAndInsert(int row, int col, Vehicle vehicle, ParkingSpot[][] parkingLot) throws IllegalArgumentException{
        if(row < 0 || row >= n || col < 0 || col >= n){
            throw new IllegalArgumentException("Invalid Cell");
        }
        ParkingSpot space = parkingLot[row][col];
        if(!space.isEmpty()){
            throw new IllegalArgumentException("Already occupied");
        }
        if(!space.getSpaceType().equals(vehicle.getVehicleType())){
            throw new IllegalArgumentException("Not your vehicle type parking spot");
        }
        else{
            space.setEmpty(false);
            space.setVehicle(vehicle);
            System.out.println("Vehicle added : ");
            ParkingLot.printLot(parkingLot);
            return true;
        }
    }

    public static boolean removeVehicle(int row, int col, Vehicle vehicle, ParkingSpot[][] parkingLot) throws IllegalArgumentException{
        if(row < 0 || row >= n || col < 0 || col >= n){
            throw new IllegalArgumentException("Invalid Cell");
        }
        ParkingSpot space = parkingLot[row][col];
        if(space.isEmpty()){
            throw new IllegalArgumentException("Empty Cell!");
        }
        if(space.getVehicle() != vehicle){
            throw new IllegalArgumentException("Not your vehicle");
        }
        else{
            space.setEmpty(true);
            space.setVehicle(null);
            System.out.println("Vehicle removed : ");
            ParkingLot.printLot(parkingLot);
            return true;
        }
    }

}
