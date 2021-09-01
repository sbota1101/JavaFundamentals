package Strings;

public class revers {

    //Write a Java program to reverse an array of integer values
    //Un array unidimensional


    static void reverse(int a[]) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length -i- 1] = a[i];        }

        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    public static void main(String[] args) {
        int[] b = {1, 5, 8, 9, 2};
        reverse(b);


    }
}