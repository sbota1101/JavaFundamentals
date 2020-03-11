package Home.hello.array.ex;

import java.util.Scanner;

public class LinearSearch {
    //Write a java program to perform linear search in java.
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "]=");
            array[i] = in.nextInt();
            System.out.println("--");
        } //se citeste o matrice de la tastaura
        System.out.println("Citeste nr");
        int nr = in.nextInt();
        System.out.println( nr + " " +"is found at"+" "+searchLinear(array, nr));

    }

    public static int searchLinear(int[] array, int nr) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nr) {
                return i;
            }
        }
        return -1;
    }
}




