package javaFund1;
import java.util.Scanner;

public class ifElse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string "+ss);

       // reading from the console
        /* read from keyboard
        check using if-else
        <10
        [10-20]
        [20-30]
        >30
         */
        int x;
        x=Integer.parseInt(ss);
        if (x<10) {
            System.out.println("x<10");
        } else {

            if (x > 10 && x < 20) {
                System.out.println("x between [10,20]");
            } else {
                if (x > 20 && x < 30) {
                    System.out.println("x between [20,30]");
                } else {
                    System.out.println("x>30");
                }
            }
        }

    }
}
