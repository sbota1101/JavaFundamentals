package BubbleSort;

import java.util.Scanner;

public class nrInterschimbate {
    //se citesc de la tastatura 2 var si apoi se inverseaza intre ele

    public static void main(String[] args) {
        Scanner firstScanner=new Scanner(System.in);
        System.out.println("enter the first number= ");
        int n=firstScanner.nextInt();
        System.out.println("enter the second number= ");
        int m =firstScanner.nextInt();
        int z=n;
        n=m;
        m=z;
        System.out.println(n);
        System.out.println(m);
    }
}
