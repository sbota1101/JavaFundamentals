package Home.hello.array;

import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        Scanner firstScanner =new Scanner(System.in);
        System.out.println("Enter age 1");
        int n=firstScanner.nextInt();
        System.out.println("Enter age 2");
        int m= firstScanner.nextInt();
        System.out.println("Enter age 3");
        int p=firstScanner.nextInt();
        if (n<m){
            System.out.println("You are a teenager");
        }
        else if (m < p) {
            System.out.println("you are an adolescent");

        }
        else {
            System.out.println("You are an adult");
        }
    }
}
