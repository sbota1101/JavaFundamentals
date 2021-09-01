package Algoritmi;

import java.util.Scanner;

public class AutomorphicNumber {
    //In this section, we will learn automorphic numbers with examples and also create Java programs that check whether the number
    // is automorphic or not.
    //Eg:For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself.
    // Some other automorphic numbers are 5, 6, 36, 890625, etc.

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number:");
        int n=scanner.nextInt();
        int square=Math.multiplyExact(n,n);
        System.out.println("square="+square);
        String s = Integer.toString(n);
        String s1="";
        String s2="";
        int copy=square;
        int uc=0;
        int secUc=0;
        while (square!=0){
            uc=square%10;
            secUc=(square/10)%10;
             s1 = Integer.toString(uc);
             s2 = Integer.toString(secUc);
            if(n==uc){
                System.out.println("Sunt numere amorphe");

            }else if(!s.equals(s2+s1)){
                System.out.println("nu sunt");

            }
            square=square/10;
            break;
       }



            if (s.equals(s2 + s1)) {
                System.out.println("Sunt numere amorphe");

            }else if(n!=uc){
                System.out.println("Nu sunt");
            }

    }
}
