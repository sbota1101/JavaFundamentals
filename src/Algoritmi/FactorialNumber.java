package Algoritmi;

import java.util.Scanner;

public class FactorialNumber {
    //Write a java program to print factorial of a number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numer n =");
        int n = in.nextInt();
        int nr = 1;
        int i = 1;
        while (i <= n) {
            nr = nr * i;
            System.out.println(nr);
            i++;
        }
        System.out.println(nr);
    }
}
