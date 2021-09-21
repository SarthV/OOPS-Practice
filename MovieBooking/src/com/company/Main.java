package com.company;

import com.company.account.Admin;
import com.company.account.Kiosk;
import com.company.account.User;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Admin work
        Admin admin = new Admin();
        MovieComplex complex = admin.createMovieComplex("PVR");
        CinemaHall hall1 = admin.createCinemaHall(1,15,20);
        admin.addCinemaHall(hall1,complex);
        Kiosk kiosk = admin.createKiosk("Kiosk 1");

        //Create a test User
        User user1 = new User("Sarth");

        //Operations at the Kiosk
        CinemaSeat seat1 = kiosk.chooseSeat('A', 8);
        MovieTicket ticket1 = kiosk.checkAndCreateTicket(seat1, hall1);
        kiosk.assignTicket(ticket1,user1);
        System.out.println(hall1.getLayout()[0][8].getEmpty());

        //Uncomment the below lines ---> Error is expected since the seat is already occupied
//        CinemaSeat seat2 = kiosk.chooseSeat('A', 8);
//        System.out.println(seat2.getEmpty());
//        MovieTicket ticket2 = kiosk.checkAndCreateTicket(seat2, hall1);
    }
}
