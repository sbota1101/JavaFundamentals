package Coding;

import java.util.Scanner;

public class DivisionNumber {
    //m.	Read a big number from the keyboard (let’s say 20 digits). Compute the division by a one digit number.
    public static void main(String[] args) {
        System.out.println("Input the number : ");
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        System.out.println("Div=");
        int div = in.nextInt();
        /*long uc = 0;
        for (int i = 0; i < n; i++) {
            uc = n % 10;
            n = n / 10;
            System.out.println(uc);
        }
        System.out.println(n);*/
        if (div > 10) {
            System.out.println("The number must be one digit");
            div = in.nextInt();
        }
        long rez = n / div;
        System.out.println("Rez=" + rez);
    }
}

