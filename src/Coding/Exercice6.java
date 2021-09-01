package Coding;

import java.util.Scanner;

//Create a program that reads a number in a method.
// Then create another method that can print a reverse triangle of the size given by the parameter
//****
// * *
//  *
public class Exercice6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Citeste nr");
        int nr = in.nextInt();
        printeaza(nr);

    }
    public static void printeaza(int nr) {
        if(nr%2==0){
            for (int i = 0; i < nr; i++) {
               if(i==0) {System.out.print(" " + "*");}
               else{ System.out.print("*");}
            }

        }else{
            for (int i = 0; i < nr; i++) {
                System.out.print("*");
            }
        }
            System.out.println();
            for (int j = 0; j < (nr / 2); j++) {
                System.out.print(" " + "*");
            }
            System.out.println();

            System.out.println(" " + " " + "*");
        }
    }


