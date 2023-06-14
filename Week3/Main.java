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

    }
    }
