package Exercitii;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and both
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + " ");
            else if (i % 3 == 0)
                System.out.print(i + " ");
            else if (i % 5 == 0)
                System.out.print(i + " ");
        }
        int n = 0;
        while (n < 80) {
            n = n + 8;
            System.out.println(n);
        }
        int m=0;
        while (m<100){
            if(m%2==0)
                System.out.println(m);
            m++;
        }
        int n1;
        char s1, s2, s3;
        Scanner in1 = new Scanner(System.in);
        System.out.print("Input number: ");
        n1 = in1 .nextInt();
        System.out.printf("%d + %d%d  + %d%d%d \n", n, n, n, n, n, n);

        System.out.println(" "+" " +" "+ "1");
        System.out.print(" "+" ");
        for (int i = 1; i <= 3; i++)
            System.out.print("2");
        System.out.println();
        System.out.print(" ");
        for (int i = 1; i <= 5; i++)
            System.out.print("3");
        System.out.println(" ");
        for (int i = 1; i <= 7; i++)
            System.out.print("4");
        System.out.println(" ");
        for(int i=1;i<=9;i++)
            System.out.print("5");

        for (int i = 2; i <10 ; i++) {
            if(!(i%2==0))
                System.out.println(i);

        }
       // Write a program that prints the first n prime numbers: n = 4
      int i=4;
      System.out.println(i);
        while (i<=16) {
            i = i + 4;
            if(i<=16)
            System.out.println(i);
        }
    }

}





