package com.company;

import com.company.account.Admin;
import com.company.account.Kiosk;
import com.company.account.User;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Admin admin = new Admin();
        MovieComplex complex = admin.createMovieComplex("PVR");
        CinemaHall hall1 = admin.createCinemaHall(1,15,20);
        admin.addCinemaHall(hall1,complex);
        User user1 = new User("Sarth");
        Kiosk kiosk = admin.createKiosk("Counter 1");
        CinemaSeat seat1 = user1.chooseSeat("A", 8);
        MovieTicket ticket1 = kiosk.createTicket(seat1, hall1);
        kiosk.assignTicket(ticket1,user1);
    }
}
