package com.company;

import com.company.vehicle.Vehicle;

public class ParkingLot{

    public static ParkingSpace[][] initializeLot(int n){
        ParkingSpace[][] parkingLot = new ParkingSpace[n][n];
        for(ParkingSpace[] row : parkingLot){
            for(ParkingSpace col : row) {
                col = new ParkingSpace();
                //System.out.print(col.getVehicle().getModel());
            }
            //System.out.println();
        }
        return parkingLot;
    }
    public static void printLot(ParkingSpace[][] parkingLot){
        for(ParkingSpace[] row : parkingLot){
            for(ParkingSpace col : row) {
                if(col.isEmpty())System.out.print("_ ");
                else{
                    System.out.print(col.getVehicle().getModel().charAt(0));
                }
            }
            System.out.println();
        }
    }
}
