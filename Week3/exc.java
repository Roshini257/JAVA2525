package Week3;

import java.util.Scanner;



public class exc {
    public void test() {
        try {
            System.out.println("Enter-number :");
            Scanner sc= new Scanner(System.in);
            String n= sc.nextLine();

            int i = Integer.parseInt(n);
            System.out.println("String converted to number is :"+i);


        } catch (NumberFormatException e) {

            System.out.println("Number format exception");


        }

//        System.out.println(j);

    }
}
