package com.zm;

import com.zm.entities.Customer;
import com.zm.entities.Ticket;
import com.zm.exceptions.InvalidDateException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Date of flight (dd/MM/yyyy): ");
        Date flightDate = sdf.parse(sc.next());
        System.out.print("Seat: ");
        sc.nextLine();
        String seat = sc.nextLine();
        System.out.print("Destination: ");
        String destination = sc.nextLine();

        Ticket ticket = new Ticket(flightDate, destination, seat);
        Customer customer = new Customer(name, email);
        customer.addTicket(ticket);
        }
        catch(InvalidDateException e){
            System.out.println(e.getMessage());
        }
        catch (ParseException e){
            System.out.println("Invalid date format");
        }

        sc.close();
    }
}

