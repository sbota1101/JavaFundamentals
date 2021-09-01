package DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Tema {
    //Write a Program to store date times and show which one of them denotes a time and date that is during office hours (Mo-Fri 9:00 - 17:00);
    //   Your program should support the following operations
    //Read a number n from the console
    //Read n date times in the following format “d/MM/yyyy HH:mm:ss”
    //Display a menu that supports the following options:
    //       “1. List all dates stored so far
    //       2. Provide a date position; Display if date in provided position is during office hours or not
    //       3. List all dates in office hours
    //       4. (Bonus) List all dates in chronological order
    //       0. Exit”
    //Bonus display all dates in chronological order
    //Hints:
    //The number should be more than 0 and less than 15, display an error message if it isn’t; this is the array size
    //should add provided date time to an array (assume input is always in correct format*);
    //   Option 1 should list out to the console all the date times added so far;
    //   Option 2.1 should read a number from the console;
    //   Option 2.2 if there is currently a date time stored in the array with an index at the provided number you should print out “working”/“free” depending if it is during office hours or not;
    //   Option 2.3 if there is no date stored at the number provided show an error message;
    //   Option 3 should list out to the console only the date times that are during office hours;
    //   Bonus - Option 4 should list our all date times stored so far in chronological order; some sorting might come in handy
    //   Bonus Bonus - Sorting should occur in a different class
    //*If date time is provided in a wrong format the program can fail/crash;
    //Some example data you can use:
    //   09/11/2019 19:47:15
    //   06/06/2013 09:17:33
    //   9/08/2015 12:30:00
    //   13/03/2017 08:59:59
    //   27/04/2018 17:00:00
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dati n: ");

        int n = Integer.parseInt(in.nextLine());

        if ((n >= 15) || (n <= 0)) {
            System.out.println("Incorrect Value!!!!Please insert a value from 1 to 14");
            System.out.println("n =");
            n = Integer.parseInt(in.nextLine());
        }

        LocalDateTime[] data = new LocalDateTime[n];
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");

        for (int i = 0; i < data.length; i++) {
            System.out.print("data[" + i + "]=");

            data[i] = LocalDateTime.parse(in.nextLine(), formatter);  //citeste data in formatul corespunzator

            System.out.println("***");
        }
        String option;
        do {
            System.out.println();
            System.out.println("1. List all dates stored so far \n" +
                    "2. Provide a date position;\n   " +
                    "Display if date in provided position is during office hours or not\n" +
                    "3. List all dates in office hours\n" +
                    "4. (Bonus) List all dates in chronological order\n0. Exit\n\nYour Option: ");
            option = in.nextLine();

            switch (option) {
                case "1":
                    afisare(data);
                    break;
                case "2": {
                    System.out.println("Dati pozitia de pe care sa se citeasca data: ");
                    int poz = Integer.parseInt(in.nextLine());
                    if (poz <= data.length - 1) {
                        System.out.println("Data de pe pozitia " + poz + " este: " + data[poz]);
                        System.out.println("Ziua saptamanii: " + data[poz].getDayOfWeek());
                        if (officeHours(data[poz]) == true) {
                            System.out.println("Working");
                        } else System.out.println("Free!!!");

                    } else {
                        System.out.println("Pozitia " + poz + " nu exista!!!");
                        do {
                            System.out.println("Dati alta pozitie: ");
                            poz = Integer.parseInt(in.nextLine());
                        }
                        while (poz > data.length - 1);
                        System.out.println("Data de pe pozitia " + poz + " este: " + data[poz]);
                    }
                }
                break;
                case "3": {
                    System.out.println("Dates in office hours: ");

                    for (LocalDateTime c : data) {
                        if (officeHours(c) == true)
                            System.out.println(c);
                    }
                }
                break;
                case "4": {
                    System.out.println(Arrays.toString(data));
                    System.out.println("Datele Sortate Cronologic:");
                    Arrays.sort(data);
                    System.out.println(Arrays.toString(data));

                }

                break;
                case "0":
                    break;
                default:
                    System.out.println("Optiune incorecta!Alegeti [1-4]");
                    continue;
            }
        } while (!"0".equalsIgnoreCase(option));
    }

    public static void afisare(LocalDateTime[] data) {
        System.out.println("Dates stored so far: ");
        for (LocalDateTime d : data) {
            System.out.println(d);
        }
    }

    public static boolean officeHours(LocalDateTime office) {
        if ((office.getDayOfWeek().getValue() < 6) && (office.getHour() >= 9) && (office.getHour() <= 17))
            return true;
        else
            return false;
    }
}





