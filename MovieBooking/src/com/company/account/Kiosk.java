package com.company.account;

import com.company.CinemaHall;
import com.company.CinemaSeat;
import com.company.MovieTicket;
import com.company.TicketStatus;

public class Kiosk {
    String name;
    public Kiosk(String name){
        this.name = name;
    }

    public Kiosk(){

    }

    public MovieTicket createTicket(CinemaSeat seat, CinemaHall hall){
        MovieTicket ticket = new MovieTicket();
        ticket.setHall(hall);
        ticket.setSeat(seat);
        seat.setEmpty(false);
        return ticket;
    }

    public void assignTicket(MovieTicket ticket, User user){
        ticket.setStatus(TicketStatus.ACTIVE);
        user.setTicket(ticket);
    }
}
