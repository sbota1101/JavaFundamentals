package Coding;

public class string {
    //Write a Java program to create the concatenation of the two strings except removing the first
    //character of each string. The length of the strings must be 1 and above: “Java” and
    //“Fundamentals”
    public static void main(String[] args) {
        String str1="Java";
        String str2="Fundamentals";
        System.out.println(str1.substring(1,3)+str2.substring(1,11));
        System.out.println(str2.length());
    }
}
