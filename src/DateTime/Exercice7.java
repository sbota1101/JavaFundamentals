package DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercice7 {
    //Write a java prog to show the date after reading years,months and days from console
    public static void main(String[] args) {
        System.out.println("Year:");
        Scanner in =new Scanner(System.in);
        String year = in.nextLine();
        System.out.println("Month:");
        Scanner in1 =new Scanner(System.in);
        String month = in1.nextLine();
        System.out.println("Day:");
        Scanner in2 =new Scanner(System.in);
        String day = in2.nextLine();
        System.out.println(year+ " "+month+ " "+ day);
        LocalDate aDate = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        System.out.println(aDate);
    }
}
