package Algoritmi;

import java.util.Scanner;

//A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.
//Number = 145
//
//        145 = !1 + !4 + !5
//
//        =1+4*3*2*1+5*4*3*2*1
//
//        =1+24+120
//
//        145=145
public class PetersonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numer n =");
        int n = scanner.nextInt();
        int copy=n;
        int sum=0;


        while(n!=0){
            int uc=n%10;
            int i=1;
            int nr=1;
            while (i <= uc) {
                nr = nr * i;
                if(i==uc){
                sum+=nr;}
                i++;
            }
            System.out.println(sum);
            n=n/10;
        }
        if(copy==sum){
            System.out.println("Peterson Number");
        }else{
            System.out.println("Not peterson number");
        }
    }

}
