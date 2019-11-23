package Coding;

import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        int [] array ;

       array= initializare(100);
        afisare(array);
    }

    private static int[] initializare(int limit) {
       int[] array=new int[limit];
       int count=0;
        for (int i = 0; count < limit; i++) {
            if (i % 11 == 0) {
             //   System.out.println(count);
                array[count++]=i;
               // System.out.println(i); asa sau cu for afis la fel
            }

        }
        return array;
    }

    private static void afisare(int[] array) {
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
    }
    /**
     * Metoda initializare imi intoarce un array cu primele limit=100,in cazul nostru,nr div cu 11
     * limit=nr din array
     * return-un array cu primele 100 nr div cu 11
     *
     */
}
