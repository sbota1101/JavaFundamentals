package Algoritmi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader1 {
    public static void main(String[] args) throws IOException
    {
        System.out.print ("Introduceti un numar=");
        InputStreamReader isr = new InputStreamReader(System.in);
        java.io.BufferedReader br = new java.io.BufferedReader(isr);
        String s = br.readLine();
        Double a = Double.parseDouble(s);
        System.out.println("a =");
        System.out.printf("%08.2f%n", a);

    }

   
}

