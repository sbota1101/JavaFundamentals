package Coding;

import java.util.Scanner;

public class Exercices2 {
    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);
        System.out.println("Enter numer n =");
        int n = firstScanner.nextInt();
        System.out.println("Enter numer m =");
        int m = firstScanner.nextInt();
        while(n<0||m<0) {
            System.out.println("Enter numer n =");
            n = firstScanner.nextInt();
            System.out.println("Enter numer m =");
            m = firstScanner.nextInt();
        }
            numereCitite(n, m);
        }

    private static void numereCitite(int n, int m) {
        long x=System.currentTimeMillis();
        for (int i=1;i<=m;i=i+n){
         System.out.println(i);
        if (System.currentTimeMillis()-x>10000)
        {break;
        }
    }
}