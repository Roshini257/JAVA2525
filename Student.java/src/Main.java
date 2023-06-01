
import java.lang.System.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println("Enter your name :");
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();
       s.setName(n);
     //   System.out.println("Name is "+s.name);
        String name = s.getName();
        System.out.println("Name: " + name);


    }
}