package com.company.account;

import com.company.*;

public class Kiosk {
    String name;
    public Kiosk(String name){
        this.name = name;
    }

    public Kiosk(){

    }

    public CinemaSeat chooseSeat(char row, int col){
        CinemaSeat seat = new CinemaSeat();
        seat.setColumn(col);
        seat.setRow(row);
        return seat;
    }

    public MovieTicket checkAndCreateTicket(CinemaSeat seat, CinemaHall hall) throws IllegalArgumentException{
        int col = seat.getColumn();
        char row = seat.getRow();
        if(!hall.getLayout()[row-'A'][col].getEmpty()){
            throw new IllegalArgumentException("Already occupied seat");
        }
        seat.setEmpty(false);
        MovieTicket ticket = new MovieTicket();
        ticket.setHall(hall);
        ticket.setSeat(seat);
        hall.getLayout()[row-'A'][col] = seat;
        return ticket;
    }

    public void assignTicket(MovieTicket ticket, User user){
        ticket.setStatus(TicketStatus.ACTIVE);
        user.setTicket(ticket);
    }

    public CinemaHall searchMovieToGetHall(Movie movie, MovieComplex complex) throws IllegalArgumentException{
        if(complex.getMovieAndCinemaMap().containsKey(movie)){
            return complex.getMovieAndCinemaMap().get(movie);
        }
        else{
            throw new IllegalArgumentException("no such movie here!");
        }
    }
}
