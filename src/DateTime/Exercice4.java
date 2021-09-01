package DateTime;

import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Exercice4 {


    //Write a java prog.to get the dayes 10 days before and after today
    public static void main(String[] args) {
        LocalDate astazi = LocalDate.now();
        LocalDate acum10zile;
        LocalDate dupa10zile;
        acum10zile = astazi.minus(10,DAYS);
        dupa10zile = astazi.plus(10,DAYS);
        System.out.println(astazi);
        System.out.println(acum10zile);
        System.out.println(dupa10zile);
    }
}
