package Arrays;

import java.util.Scanner;

public class Array3 {
    // Java Program to print the duplicate elements of an array
    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }

        }


    }
}
