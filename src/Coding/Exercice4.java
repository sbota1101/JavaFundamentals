package Coding;

import java.util.Scanner;
//Varianta compacta a programului
public class Exercice4 {
    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);
        String propozitie = firstScanner.nextLine();
        System.out.println(propozitie);
        char[] litere = new char[propozitie.length()];
        int[] count = new int[propozitie.length()];
        for (int i = 0; i < propozitie.length(); i++) {
            if (propozitie.charAt(i) == ' ') {
                continue;
            }
            boolean isdublicate = false;
            for (int j = 0; j <= i; j++) {
                if (litere[j] == propozitie.charAt(i)) {
                    count[j]++;
                    isdublicate = true;
                    break;
                }
            }
            if (isdublicate == false) {
                for (int j = 0; j < litere.length; j++) {
                    if (litere[j] == 0) {
                        litere[j] = propozitie.charAt(i);
                        count[j] = 1;
                        break;
                    }
                }

            }

        }

        afisare(litere);
        afisare(count);
    }


    private static void afisare(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void afisare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0){
                break;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
