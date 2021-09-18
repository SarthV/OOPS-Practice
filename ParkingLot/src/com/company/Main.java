package com.company;

import com.company.account.Admin;
import com.company.vehicle.Car;
import com.company.vehicle.Type;
import com.company.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
	// Ignore the below comments (Belong to an older version of the program)
//        Vehicle myVehicle = new Vehicle("Ciaz", Type.CAR);
//        Vehicle myVehicle2 = new Vehicle("Merc", Type.CAR);
//        ParkingSpot[][] lot = ParkingLot.initializeLot(5);
//        ParkingLot.checkAndInsert(0,0,myVehicle,lot);
//        ParkingLot.checkAndInsert(2,2,myVehicle2, lot );
//        ParkingLot.removeVehicle(0,0,myVehicle, lot);

        // NEW "TEST" CODE STARTS HERE
        Admin admin = new Admin();
        ParkingFloor firstFloor =  admin.addParkingFloor();
        firstFloor.setFloorName("First");
        Car car1 = new Car();
        car1.setModel("BMW");
        ParkingSpot spot = admin.createParkingSpot(1);
        firstFloor.addParkingSpot(spot);
        System.out.println(firstFloor.getNumberOfFreeSpots());
        firstFloor.assignVehicleToSpace(spot, car1);
        System.out.println(firstFloor.getNumberOfFreeSpots());
        firstFloor.removeVehicleFromSpot(spot);
        System.out.println(firstFloor.getNumberOfFreeSpots());
        System.out.println(spot.getVehicle());
        firstFloor.assignVehicleToSpace(spot, car1);
        System.out.println(spot.getVehicle().getModel());

    }
}
