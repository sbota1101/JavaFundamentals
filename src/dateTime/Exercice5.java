package dateTime;

import java.time.LocalDateTime;

public class Exercice5 {
    //Write a java prog.to get a date and time after 2 weeks and 10 minutes
    public static void main(String[] args) {
        LocalDateTime astaziAcum = LocalDateTime.now();
        System.out.println(astaziAcum.plusWeeks(2).plusMinutes(10));
    }
}
