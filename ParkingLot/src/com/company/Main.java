package com.company;

import com.company.vehicle.Type;
import com.company.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle myVehicle = new Vehicle("Ciaz", Type.CAR);
        Vehicle myVehicle2 = new Vehicle("Merc", Type.CAR);
        RealDeal.startTheLot();
        RealDeal.checkAndInsert(0,0,myVehicle);
        RealDeal.checkAndInsert(2,2,myVehicle2);
        RealDeal.removeVehicle(0,0,myVehicle);
        // And so on.....

    }
}
