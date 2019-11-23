package dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercice2 {
    //Write a java program to get day in week name for now date

    public static void main(String[] args) {
        LocalDate astazi=LocalDate.now();
        DayOfWeek dayOfWeek = astazi.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
