package com.zm.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private String name;
    private String email;

    List<Ticket> ticketList = new ArrayList();

    public Customer(){};

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void addTicket(Ticket ticket){
        ticketList.add(ticket);
    }

    public void removeTicket(Ticket ticket){
        ticketList.remove(ticket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(email, customer.email) && Objects.equals(ticketList, customer.ticketList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, ticketList);
    }
}
