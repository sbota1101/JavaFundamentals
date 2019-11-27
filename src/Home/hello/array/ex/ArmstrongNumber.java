package Home.hello.array.ex;

import java.util.Scanner;

public class ArmstrongNumber {
    //Write a java program to check Armstrong number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numer n =");
        int n = in.nextInt();
        int uc;
        int copy=n;
        double x = 1;
        double sum = 1;
        double y = 3.0;
        for (int i = 0; i < n; i++) {
            uc = n % 10;
            n = n / 10;
            x = Math.pow(uc, y);
            sum = sum + x;
        }
        System.out.println("Sum is" + sum);
        if (copy == sum) {
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}