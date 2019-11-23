package Coding;

import java.util.Scanner;

public class Exercice4_1 {
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
            boolean isdublicate = isIsdublicate(litere, count,propozitie.charAt(i));
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

    private static boolean isIsdublicate(char[] litere, int[] count,char litera) {
        boolean isdublicate = false;
        for (int j = 0; j < litere.length; j++) {
            if (litere[j] == litera) {
                count[j]++;
                isdublicate = true;
                break;
            }
        }
        return isdublicate;
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

