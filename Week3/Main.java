package Week3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

////        Exceptions
//
//        exc ex= new exc();
//        ex.test();
////custom exception

        try {
            String s = "sss "; // Replace with your desired file name
            custom cus = new custom("Custom exception occurred.");
            String result = cus.test1(s);
            System.out.println("Result: " + result);
        } catch (custom e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }

//        Thread

        Numberthread num= new Numberthread();
//          num.start();

// Runnable


        RunnableThread usingR=new RunnableThread();
        Thread t=new Thread(usingR);

        num.start();
        t.start();

//


        BookingThread.TicketBookingSystem bookingSystem = new BookingThread.TicketBookingSystem();

        BookingThread passenger1 = new BookingThread(bookingSystem, "John");
        BookingThread passenger2 = new BookingThread(bookingSystem, "Alice");
        BookingThread passenger3 = new BookingThread(bookingSystem, "Bob");
        BookingThread passenger4 = new BookingThread(bookingSystem, "Emily");
        BookingThread passenger5 = new BookingThread(bookingSystem, "David");
        BookingThread passenger6 = new BookingThread(bookingSystem, "Emma");

        passenger1.start();
        passenger2.start();
        passenger3.start();
        passenger4.start();
        passenger5.start();
        passenger6.start();
    }
    }
