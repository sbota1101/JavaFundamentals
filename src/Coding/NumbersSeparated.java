package Coding.Punctul;

import java.util.Scanner;

public class LEx12 {
    //l.	Read a sequence of numbers from the keyboard separated by ;.
    // Print the new numbers as a difference between the sum of the others and the actual number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dati numerele: ");
        String sirNumere = input.nextLine();
        String[] sirArrays = sirNumere.split("\\;");
        int[] arrays = new int[sirArrays.length];
        for (int i = 0; i < sirArrays.length; i++) {
            String x = sirArrays[i];
            arrays[i] = Integer.parseInt(x);
            System.out.println("index[" + i + "]= " + arrays[i]);
        }
        int sum = 0;
        int prod = 1;
        for (int i : arrays) {
            sum = sum + i;
            prod = prod * i;
        }
        System.out.println("suma este: " + sum);
        System.out.println("produsul este: " + prod);

    }
}
