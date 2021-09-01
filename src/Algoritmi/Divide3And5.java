package Algoritmi;

import java.util.Scanner;

//Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
public class Divide3And5 {

    public static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Introduceti nr:n=");
        int n = number.nextInt();

        System.out.println(sum(n));
    }
}
