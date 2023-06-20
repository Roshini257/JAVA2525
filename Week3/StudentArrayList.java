package Week3;

import java.util.ArrayList;
import java.util.List;

class Gpalist {
    private String firstName;
    private String lastName;
    private double gpa;

    public Gpalist(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

public class StudentArrayList {
    public static void main(String[] args) {

        List<Gpalist> students = new ArrayList<>();
        students.add(new Gpalist("shiva", "sai", 3.5));
        students.add(new Gpalist("Ali", "Mo", 3.8));
        students.add(new Gpalist("Vamshi", "krish", 2.9));
        students.add(new Gpalist("sai", "Naga", 3.2));
        students.add(new Gpalist("sravan", "murali", 3.9));


        double averageGpa = students.stream()
                .mapToDouble(Gpalist::getGpa)
                .average()
                .orElse(0.0);;


        students.removeIf(student -> student.getGpa() < averageGpa);


        students.forEach(System.out::println);
    }
}