package com.company;

public class MovieTicket {
    CinemaHall hall;
    CinemaSeat seat;
    TicketStatus status = TicketStatus.NA;

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

    public CinemaHall getHall() {
        return hall;
    }

    public void setHall(CinemaHall hall) {
        this.hall = hall;
    }

    public CinemaSeat getSeat() {
        return seat;
    }

    public void setSeat(CinemaSeat seat) {
        this.seat = seat;
    }

    public MovieTicket(){

    }
}
