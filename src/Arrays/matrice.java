package Arrays;

import java.util.Scanner;
//se citeste o matrice de la tastaura
/**
 * using enchanced for write the array
 * format:(x,v,d,f,g)
 */
public class matrice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String[] arrayOfStrings = new String[n];
        for (int i = 0; i < arrayOfStrings.length; i++) {
            System.out.print("arrayOfStrings[" + i + "]=");
            arrayOfStrings[i] =in.nextLine(); ;
            System.out.print("--");
        }
        System.out.print("(");
        for (String ss1 : arrayOfStrings) {
            if (ss1 == (arrayOfStrings[4])) {
                System.out.print(ss1);
            }
            else {
                System.out.print(ss1 + " , ");//aici se printeaza in format sir de caractere



            }
        }

        System.out.println(")");
    }
}
