package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Autowired
    private Address address;

    @Autowired
    private Account account;

    // Constructors, getters, and setters

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Person Information:");
        System.out.println("Address: " + address.getStreet() + ", " + address.getCity());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}