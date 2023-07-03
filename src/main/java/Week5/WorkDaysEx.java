package src.main.java.Week5;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WorkDaysEx {
        public static void main(String[] args) {
            LocalDate startDate = LocalDate.of(2023, 7, 3);

            LocalDate endDate = startDate.withDayOfMonth(startDate.lengthOfMonth());

            System.out.println(endDate);
            int workingDays = 0;
            LocalDate i = startDate;
            while (i.isBefore(endDate) || i.isEqual(endDate)) {
                if (i.getDayOfWeek() != DayOfWeek.SATURDAY && i.getDayOfWeek() != DayOfWeek.SUNDAY) {
                    workingDays++;
                }
                i = i.plus(1, ChronoUnit.DAYS);
            }

            System.out.println("Number of working days until the end of the month: " + workingDays);
        }
    }

