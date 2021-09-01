package Exercitii;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        //Write a Java program that prints all the powers of a number under 100: 3
        Scanner in = new Scanner(System.in);
        System.out.println("n2=");
        double n2 = in.nextInt();
        double x = 0.0;
        for (int i = 1; i < 100; i++) {
            x = Math.pow(n2, i);
            if (x < 100) {
                System.out.println(x);
            } else
                break;

        }
        //Write a program that prints the first n prime numbers: n = 4
        for (int i = 2; i <9 ; i++) {
            if(i==2)
                System.out.println(i);
            if(!(i%2==0))
                System.out.println(i);

        }

    }
}

