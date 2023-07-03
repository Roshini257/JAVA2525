package src.main.java.Week2;


import src.main.java.Week2.Student1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import static java.lang.Integer.parseInt;
import static java.util.Arrays.*;

public class CsvImport {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("/Users/roshiniracha/Documents/Student.csv");
        Scanner s = new Scanner(f);
        String line;

        Student1[] stu = new Student1[10];
        for (int i = 0; s.hasNextLine(); i++) {
            line = s.nextLine();
            String[] str = line.split(",");
            String firstName = str[0];
            String lastName = str[1];
            int gpa = Integer.parseInt(str[2]);
            stu[i] = new Student1(firstName, lastName, gpa);

        }

        sort(stu);

        for (int i = 0; i < 10; i++) {
            System.out.println(stu[i]);
        }

    }
}
