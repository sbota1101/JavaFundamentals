package Exercitii;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //Write a Java program to insert an element at a specific position into an array: [1, 7, 3, 10, 9];
        //insert 4 at position 2; remember that an array starts from 0
        //Output: [1, 7, 4, 3, 10, 9]

        int[] arr = new int[]{1, 7, 3, 10, 9};
        int n = arr.length;
        int newarr[] = new int[n + 1];
        int pos = 2;
        int value = 4;
        for (int i = 0; i < newarr.length; i++) {
            if (i < pos)
                newarr[i] = arr[i];
            else if (i == pos)
                newarr[i] = value;
            else
                newarr[i] = arr[i - 1];
        }
        System.out.println("Inserted array:" + Arrays.toString(newarr));
        //Write a Java program to find the duplicate values of an array of integers: [1, 7, 3, 7, 10, 1, 9]
        int[] arr1 = new int[]{1, 7, 3, 7, 10, 1, 9};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j])
                    System.out.println(arr1[j]);
            }

        }
        System.out.println("punctul second max");
        //Write a Java program to find the second largest element in an array: [1, 7, 3, 10, 9]
        int[] array = new int[]{1, 7, 3, 10, 9};
        int max1=java.lang.Integer.MIN_VALUE;
        int max2 = java.lang.Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max1){
                max2=max1;
                max1 = array[i];}
            else if (array[i] > max2 && arr[i] != max1)
                max2 = array[i];
        }
            System.out.println(max2);

    }
}
