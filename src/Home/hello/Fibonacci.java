package Home.hello;

import java.util.Scanner;

public class Fibonacci {
    //Write a java program to print fibonacci series
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numer n =");
         int n=in.nextInt();
          int n1=0;
          int n2=1;
          int n3;
        System.out.println( n1);
        System.out.println(n2);
         for(int i=2;i<n;i++){
             n3=n1+n2;
             System.out.println(n3);
             n1=n2;
             n2=n3;

         }

    }
}
