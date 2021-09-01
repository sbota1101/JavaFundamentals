package DateTime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tema1 {
    //Aceiasi tema rez cu Robert in clasa
     /*
    office hours (Mo-Fri 9:00 - 17:00);

    Read a number n from the console
    Read n date times in the following format "d/MM/yyyy HH:mm:ss"
    Display a menu that supports the following options:
        “1. List all dates stored so far
        2. Provide a date position; Display if date in provided position is during office hours or not
        3. List all dates in office hours
        4. (Bonus) List all dates in chronological order
        0. Exit
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Array size n:");

        int n = Integer.parseInt(in.nextLine());
        while (n <= 0 || n > 15) {
            System.out.print("n should between 0 and 15; please provide a correct n:");
            n = Integer.parseInt(in.nextLine());
        }

        LocalDateTime[] dates = new LocalDateTime[n];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");

        for (int i = 0; i < n; i++) {
            System.out.print("dates[" + i + "]=");
            dates[i] = LocalDateTime.parse(in.nextLine(), formatter);
        }

        int optiune;
        do {
            System.out.println("1. List all dates stored so far");
            System.out.println("2. Provide a date position; Display if date in provided position is during office hours or not");
            System.out.println("3. List all dates in office hours");
            System.out.println("4. (Bonus) List all dates in chronological order");
            System.out.println("0. Exit");
            System.out.println("Please select an option:");
            optiune = Integer.parseInt(in.nextLine());

            switch (optiune) {
                case 1:
                    printDates(dates, formatter);
                    break;
                case 2:
                    System.out.print("Provide array position:");
                    int position = Integer.parseInt(in.nextLine());
                    if(isOfficeHours(dates[position])) {
                        System.out.println("work");
                    } else {
                        System.out.println("free");
                    }
                    break;
                case 3:
//                    for (int i = 0; i < dates.length; i++) {
//                        LocalDateTime x = dates[i];
//                        if(isOfficeHours(x)) {
//                            System.out.println(x);
//                        }
//                    }
                    for(LocalDateTime x: dates) {
                        if(isOfficeHours(x)) {
                            System.out.println(x);
                        }
                    }
                    break;
                case 4:
                    Sortator.sorteazama(dates);
                    printDates(dates, formatter);
                    break;
                case 0:
                default:
            }
        } while (optiune != 0);
    }


    public static boolean isOfficeHours(LocalDateTime date) {
        if (date.getDayOfWeek().equals(DayOfWeek.SATURDAY) ||
                date.getDayOfWeek().equals(DayOfWeek.SUNDAY) ) {
            return false;
        } else {
            return date.getHour() >= 9 && date.getHour() < 17;
        }
    }

    public static void printDates(LocalDateTime[] dates, DateTimeFormatter formatter) {
        for (int i = 0; i < dates.length; i++) {
            System.out.println("dates[" + i + "]=" + dates[i].format(formatter));
        }
    }
}


