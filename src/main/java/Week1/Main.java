package src.main.java.Week1;

import src.main.java.Week2.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student s = new Student();
        System.out.println("Enter-name :");
        Scanner sc= new Scanner(System.in);
        String n= sc.nextLine();
        s.setName(n);
        //   System.out.println("Name is "+s.name);
        String name = s.getName();
        System.out.println("Name: " + name);

      CSE c1 = new CSE();
      int n1 = c1.getDepartmentSize();
        System.out.println("Size:"+n1);

        Product p = new Product();
        p.setPrice(12);
        double d = p.getPrice(4);
        System.out.println("price: " + d);

        Vehicle v= new Vehicle();
        Car c = new Car();
        Vehicle v2 = new Car();

        v.color();
        c.color();
        v2.color();



}}