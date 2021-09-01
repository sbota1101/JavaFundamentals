package Algoritmi;

import java.util.Scanner;

public class PrimeNumber {
    //Write a java program to check prime number.
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter numer n =");
        int n=in.nextInt();
        if(n==0||n==1){
            System.out.println(n+" is not prime number");}
        if(n==2)
            System.out.println("2 este numar prim"+n);
        if (n %2==0){
            System.out.println("Nu este nr prim");
        }
        else{
            System.out.println("Este nr prim");
        }
    }
}
