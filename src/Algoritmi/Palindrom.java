package Algoritmi;

import java.util.Scanner;

public class Palindrom {
    //Write a java program to check palindrome number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numer n =");
        int n = in.nextInt();
        int copy=n;
        int oglindit = 0;
        int uc = 0;
        while(n!=0) {
            uc = n % 10;
            oglindit = oglindit * 10 + uc;
            n = n / 10;
        }
        if (copy== oglindit) {
            System.out.println("The number is palindrom");
        } else {
            System.out.println("The number is not palindrom");
        }

    }
}

