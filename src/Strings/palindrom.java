package Home.hello.array;


import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);
        System.out.println(ss);

        StringBuilder sb1 = new StringBuilder(ss);

        sb1.reverse();
        System.out.println(sb1);   //afiseaza inversul
        sb1.append("6789");
        System.out.println(sb1);    //adauga in sir

        sb1.delete(0,2);
        System.out.println(sb1);    //sterge de la poz 0 2 elem

    }
}