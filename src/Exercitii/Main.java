package Exercitii;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
        System.out.println("Hello \n Sorina");
        String s = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(s.toLowerCase());
        StringBuilder s2 = new StringBuilder("avaj");
        System.out.println(s2.reverse());
        String s3 = "Programmer";
        System.out.println(s3.substring(0, 5));
        StringBuilder s4 = new StringBuilder("Java");
        StringBuilder s6 = s4.delete(0, 1);
        StringBuilder s5 = new StringBuilder("Fundamentals");
        StringBuilder s7 = s5.delete(0, 1);
        System.out.println(s6.append(s7));
        String s8 = "This is Java!";
        System.out.println(s8.length());
        String s9 = "This is a Comparison";
        String s10 = "THIS is A Comparison";
        System.out.println(s9.compareToIgnoreCase(s10));
        System.out.println(s9.equalsIgnoreCase(s10));
        String s11 = "Java exercises";
        String s12 = "ses";
        String s13 = s11.substring(11, 14);
        System.out.println(s13);
        System.out.println(s13.equals(s12));

    }
    }

