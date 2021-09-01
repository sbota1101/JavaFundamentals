package Algoritmi;

import java.util.Scanner;
import java.lang.Math;
public class SunnyNumber {
    //    A number is called a sunny number if the number next to the given number is a perfect square.
//    In other words, a number N will be a sunny number if N+1 is a perfect square.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul");
        int n = scanner.nextInt();
        double copy = Math.sqrt(n + 1);
        if(copy%1==0) {
            // a is an integer
            System.out.println("Sunny number");
        } else {
            //a is not an integer.
            System.out.println("Not a sunny number");
        }

    }
}
