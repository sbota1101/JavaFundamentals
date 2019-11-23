package javaFund1;

import java.util.Scanner;

public class matrice {
    public static void main(String[] args) {
        String[] arrayOfStrings = new String[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.print("arrayOfStrings[" + i + "]=");
            arrayOfStrings[i] = in.nextLine();
            System.out.println("--");
        } //se citeste o matrice de la tastaura
        /**
         * using enchanced for write the array
         * format:(x,v,d,f,g)
         */
        System.out.print("(");
        for (String ss1 : arrayOfStrings) {
            if (ss1 == (arrayOfStrings[4])) {
                System.out.print(ss1);
            }
            else {
                System.out.print(ss1 + " , ");//aici se printeaza in format sir de caractere



            }
        }

        System.out.println(")");
    }
}
