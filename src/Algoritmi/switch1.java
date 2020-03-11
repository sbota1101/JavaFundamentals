package javaFund1;
import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string "+ss);//se citeste un sir de caract de la tastura
/*
* read from keyboard Cnp
* verify first digit and print
* male/female
*
* 1digit of cnp
* 1,2,3-male
* 2,4,6-female
*
 */
    switch(ss.charAt(0)){
        case '1':
        case '3':
        case '5':
            System.out.println("Male");
            break;
        case '2':
        case '4':
        case '6':
            System.out.println("Female");
            break;
        default:
            System.out.println("neutral");
    }
    }

    }
