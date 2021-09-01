package DateTime;

import java.time.LocalDate;

public class Exercice6 {
    //Write a java prog to get the months remaining in the year
    public static void main(String[] args) {
        LocalDate astaziLuna = LocalDate.now();
        int totalLuni=12;
      int luniRamase= totalLuni - astaziLuna.getMonthValue();
        System.out.println(luniRamase);
    }
}
