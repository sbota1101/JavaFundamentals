package Exercitii;


import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        //Write a Java program to sum values of an array: [1, 7, 3, 10, 9]
        int[] array = new int[]{1, 7, 3, 10, 9};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
        //Write a Java program to sum values of an array: [1, 7, 3, 10, 9]
        System.out.println(sum / array.length);
        //Write a Java program to print all odd numbers from an array: [1, 7, 3, 10, 9]
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                continue;
            else
                System.out.print(array[i] + " ,");
        }
        System.out.println();
        //Write a Java program to find the maximum and minimum value of an array: [1, 7, 3, 10, 9]
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
//Write a Java program to reverse an array of integer values: [1, 7, 3, 10, 9
        System.out.println("Original array:" +Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length-i - 1];
            array[array.length-i - 1] = temp;
        }
        System.out.println("Reverse array:" +Arrays.toString(array));
//Write a Java program to find the number of even and odd integers in a given array of integers:
//[1, 7, 3, 10, 9]
//Output: Odd=4; Even=1
      int odd=0;
      int even=0;
      for (int i=0;i<array.length;i++){
          if(array[i]%2==0)
              even++;
          else odd++;
      }
        System.out.println("Odd number="+odd);
        System.out.println("Even number="+even);



    }
}

