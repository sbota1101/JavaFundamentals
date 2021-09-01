package Algoritmi;

import java.util.Scanner;

public class maxim3nr {
    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);
        System.out.println("Enter numer n =");
        int n = firstScanner.nextInt();
        System.out.println("Enter numer m =");
        int m = firstScanner.nextInt();
        System.out.println("Enter numer p=");
        int p = firstScanner.nextInt();
        if (n>m && n>p){
            System.out.println("n este maxim");}
        else if (m>n && m>p){
            System.out.println("m este maxim");}
        else {
            System.out.println("p este maxim");}



    }
}
