package DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercice8 {
    //Write a prog in java to compute the difference between two dates(year,month,day)
    public static void main(String[] args) {
    LocalDate firstDate = citimDeLaTastatura();
    LocalDate secondDate=citimDeLaTastatura();
        System.out.println(firstDate);
        System.out.println(secondDate);
       Period perioada= Period.between(firstDate, secondDate);
        System.out.println(perioada);
    }

    public static LocalDate citimDeLaTastatura(){
     System.out.println("Year:");
    Scanner in = new Scanner(System.in);
    String year = in.nextLine();
        System.out.println("Month:");
    Scanner in1 = new Scanner(System.in);
    String month = in1.nextLine();
        System.out.println("Day:");
    Scanner in2 = new Scanner(System.in);
    String day = in2.nextLine();
    LocalDate aDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));

        return LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
   }
}
