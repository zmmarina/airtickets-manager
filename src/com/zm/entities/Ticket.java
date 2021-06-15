package com.zm.entities;

import com.zm.exceptions.InvalidDateException;

import java.util.Date;
import java.util.Objects;

public class Ticket {
    private static Date now = new Date();

    private Date flightDate;
    private String destination;
    private String seat;

    public Ticket(){};

    public Ticket(Date flightDate, String destination, String seat) throws InvalidDateException {
        if(flightDate.before(now)){
            throw new InvalidDateException("The flight date must be after today.");
        }
        this.flightDate = flightDate;
        this.destination = destination;
        this.seat = seat;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public void changeDate(Date newDate) throws InvalidDateException {
        if(newDate.before(now)){
            throw new InvalidDateException("The flight date must be after today.");
        }
        this.flightDate = newDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(flightDate, ticket.flightDate) && Objects.equals(destination, ticket.destination) && Objects.equals(seat, ticket.seat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flightDate, destination, seat);
    }
}
