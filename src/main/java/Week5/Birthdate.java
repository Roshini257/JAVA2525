package src.main.java.Week5;
import java.time.LocalDate;
import java.time.Period;

public class Birthdate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of(1997, 12, 25);
        Period age = Period.between(birthdate, currentDate);
        System.out.println("Age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
//        System.out.println("Years:"+age);
    }
}
