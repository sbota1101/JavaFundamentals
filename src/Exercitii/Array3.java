package Exercitii;

public class Array3 {
    //Write a Java program to find all pairs of elements in an array whose sum is equal to a specified
    //number: [1, 2, 7, 3, 10, 2, 9] with sum 4

    public static void main(String[] args) {
        int[]arr=new int[]{1,2,7,3,10,2,9};
        int sum=4;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if((arr[i]+arr[j])==sum){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
