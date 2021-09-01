package Coding;

import java.util.Scanner;

public class Exercice5 {
    //Create a program that reads a text from the keyboard.
    // Create a method that prints the letters and the numbers of apparitions in the read text.
    // Use only one uni-dimensional array to store the letters and apparitions.
    // Create another method that prints the contents of the array in a pretty way :)
    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);
        String propozitie = firstScanner.nextLine();
        System.out.println(propozitie);
        propozitie = propozitie.toLowerCase();
        char[] litere = new char[propozitie.length()];
        int count = 0;
        int[] fr = new int[propozitie.length()];
        for (int i = 0; i < propozitie.length(); i++) {
            if (propozitie.charAt(i) == ' ') {
                continue;
            }
        }

    }

    }

