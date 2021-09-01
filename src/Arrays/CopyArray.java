package Arrays;

public class CopyArray {
    //Java Program to copy all elements of one array into another array
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length ; i++) {
            array2[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
