package Exercitii;

import java.util.Scanner;

public class BuzzNumbers {
    public static void main(String[] args) {
//        Determin if a number is a buzz number or not-ends with 7,divide 7,is odd or not,if it is not natural
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number:");
        int number = scanner.nextInt();
        try {
            if (number < 1) {
                System.out.println("This number is not natural!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (number % 2 == 0) {
            System.out.println("This number is Even");
        } else {
            System.out.println("This number is Odd");
        }
        if (number % 7 == 0 || number % 10 == 7) {
            System.out.println("It is a Buzz number");
        } else {
            System.out.println("It is not a Buzz number");
        }
        if (number % 7 == 0 && number % 10 == 7) {
            System.out.println(number + "is divisible by 7 and ends with 7");
        } else if (number % 7 == 0) {
            System.out.println(number + "is divisible by 7 ");
        } else if (number % 10 == 7) {
            System.out.println(number + "ends with 7 ");
        }else{
            System.out.println(number+"is neither divisible by 7 nor does it end with 7");
        }
    }
}

