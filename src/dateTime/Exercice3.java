package dateTime;

import java.time.LocalDate;
import java.time.Month;

public class Exercice3 {
    //Write a java program to get the number of days of the current month
    public static void main(String[] args) {
        LocalDate astazi =LocalDate.now();
        Month lunacorespunzatoareZileiDeAzi = astazi.getMonth();
        int numarulDeZile = lunacorespunzatoareZileiDeAzi.maxLength();
        System.out.println( numarulDeZile);

    }
}
