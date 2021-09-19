package com.company;

public class ParkingTicket {
    int id;
    String inTime;
    String outTime;
    ParkingTicketStatus ticketStatus = ParkingTicketStatus.ACTIVE;

    public ParkingTicketStatus getTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(ParkingTicketStatus ticketStatus) {
        this.ticketStatus = ticketStatus;
    }


    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }
    ParkingTicket(int id){
        this.id = id;
    }
    ParkingTicket(){
        this.id = -1;
    }
}
