package Home.hello.array.ex;

import java.util.Arrays;

public class String4 {
    //Java Program to determine whether two strings are the anagram
    public static void main(String[] args) {
        String str1 = "Brag";
        String str2 = "Grab";
        if (str1.length() != str2.length()) {
            System.out.println("Error message");
        } else {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);

            if (Arrays.equals(string1, string2) == true) {
                System.out.println("The strings are anagram");
            } else {
                System.out.println("The strings are not anagram");
            }
        }
    }
    //Metoda2 de sortare cu un constructor
    // public static String sortString(String inputString) {
    // convert input string to char array
    // char tempArray[] = inputString.toCharArray();

    // sort tempArray
    // Arrays.sort(tempArray);

    // return new sorted string
    //return new String(tempArray);}
}

