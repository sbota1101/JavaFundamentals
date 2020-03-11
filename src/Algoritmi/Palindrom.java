package Home.hello.array.ex;

import java.util.Scanner;

public class Palindrom {
    //Write a java program to check palindrome number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numer n =");
        int n = in.nextInt();
        int oglindit = 0;
        int uc = 0;
        for (int i = 0; i < n; i++) {
            uc = n % 10;
            oglindit = oglindit * 10 + uc;
            n = n / 10;
        }
        if (uc == oglindit) {
            System.out.println("The number is palindrom");
        } else {
            System.out.println("The number is not palindrom");
        }

    }
}

