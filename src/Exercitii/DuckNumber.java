package Exercitii;

import java.util.Scanner;

public class DuckNumber {
    //Objectives
    //Your program should print the properties of a natural number. In this stage, your program should:
    //
    //Ask a user to enter a natural number;
    //If the number is not natural, the program should print an error message;
    //If the number is natural, the program should indicate the properties of the number;
    //Finish the program after printing the message.
    public static void main(String[] args) {


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
        System.out.println("Properties of" + " " + number);
        if (number % 2 == 0) {
            System.out.println("even:true");
        } else {
            System.out.println("even:false");
        }
        if (number % 2 != 0) {
            System.out.println("odd:true");
        } else {
            System.out.println("odd:false");
        }
        if (number % 7 == 0 || number % 10 == 7) {
            System.out.println("buzz:true");
        } else {
            System.out.println("buzz:false");
        }
        String str = String.valueOf(number);
        if (str.contains("0") && str.charAt(0) != 0) {
            System.out.println("duck:true");
        } else {
            System.out.println("duck:false");
        }

    }

}