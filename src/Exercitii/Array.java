package Exercitii;

import java.lang.reflect.Array;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[]{1, 7, 3, 10, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        System.out.println(sum / array.length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                continue;
            else
                System.out.print(array[i] + " ,");

        }
        System.out.println();
        int min = java.lang.Integer.MAX_VALUE;
        int max = java.lang.Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];

            System.out.println(min);
            if (array[i] > max)
                max = array[i];
        }
        System.out.println(max);
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i - 1];
            array[array.length-i - 1] = temp;
        }


    }
}

