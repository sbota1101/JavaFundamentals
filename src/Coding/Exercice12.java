package Coding;

import java.util.Scanner;


    /*
12. Create an application with a menu and with accepting parameters when starting.
We are going to create a jar and run it with some arguments.
Create a menu that will enable you to select the desired functionality and will stop when the read data is
equal to a certain parameter out of the command line. E.g: the app will be customized to display the name of the user -u name. -q "exit prog". Etc.
**) Save the current time that you opened the app. You should have an option in the menu that prints the time spent in the app.
Write a Java program to sum values of an array. Read the size and read the numbers
Write a Java program to calculate the average value of array elements
Write a Java program to remove a specific element from an array. Also change the size of the array
Write a Java program to insert an element (specific position) into an array
Write a Java program to find the second largest element in an array.
Write a Java program to find the number of even and odd integers in a given array of integers
Write a Java program to compute the average value of an array of integers except the largest and smallest values
 Write a Java program to cyclically rotate a given array clockwise by one
Create a program that reads a number in a method. Then create another method that can print a reverse triangle of the size given by the parameter
****
 * *
  *
Create a program that reads two numbers. Then create another method that can print a rectangle of the size given by the parameter.
Create also another method that can print the rectangle and the diagonals.
Read a seuqnce of numbers separated by space. Print the sum of them and product. Also the difference between the biggest and the smallest.
Read a sequence of numbers from the keyboard separated by ;. Print the new numbers as a difference between the sum of the others and the actual number
Read a big number from the keyboard (let' say 20 digits). Compute the division by a one digit number.
*/
import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int optiune;
        do {
            System.out.println("1.Write a Java program to sum values of an array. Read the size and read the numbers\n" +
                    "2.Write a Java program to calculate the average value of array elements\n" +
                    "3.Write a Java program to remove a specific element from an array. Also change the size of the array\n" +
                    "4.Write a Java program to insert an element (specific position) into an array\n\n" +
                    "5.Write a Java program to find the second largest element in an array.\n" +
                    "6.Write a Java program to find the number of even and odd integers in a given array of integers\n" +
                    "7.Create a program that reads two numbers. Then create another method that can print a rectangle of the size given by the parameter.\n" +
                    "0.Exit\n");
            System.out.println("Select an option ");
            optiune = Integer.parseInt(input.next());
            switch (optiune) {
                case 1:
                    punctul1(input);
                    break;
                case 2:
                    punctul2(input);
                    break;
                case 3:
                    punctul3(input);
                    break;
                case 4:
                    punctul4(input);
                    break;
                case 5:
                    punctul5(input);
                    break;
                case 6:
                    punctul6(input);
                    break;
                case 7:
                    punctul7(input);
                case 0:
                    break;
                default:
                    System.out.println("Optiune incorecta\n");
                    continue;
            }
        } while (optiune != 0);
    }

    //Write a Java program to sum values of an array. Read the size and read the numbers
    public static void punctul1(Scanner input) {
        System.out.println("Dimensiune array pct1: ");
        int dim = input.nextInt();
        int[] array = readArray(input, dim);
        System.out.println("Suma elementelor din array : " + sumArray(array));
    }

    // Write a Java program to calculate the average value of array elements
    public static void punctul2(Scanner input) {
        System.out.println("Dimensiune array pct 2: ");
        int dim = input.nextInt();
        int[] array = readArray(input, dim);
        int medie = sumArray(array) / dim;
        System.out.println(medie);
    }

    public static void punctul3(Scanner input) {
        System.out.println("Dati dimensiune pct 3: ");
        int dim = input.nextInt();
        int[] array = readArray(input, dim);
        System.out.println("Dimensiune array " + array.length);
        printArray(array);
        System.out.println("Dati index element :");
        int index = input.nextInt();
        array = extractPosition(array, index);
        System.out.println("Dimensiunea finala : " + array.length);
        printArray(array);
    }

    public static void punctul4(Scanner input) {
        System.out.println("Dati dimensiune, pct 4 : ");
        int dim = input.nextInt();
        int[] array = readArray(input, dim);
        System.out.println("Dimensiune initiala " + array.length);
        printArray(array);
        System.out.println("Dati index element :");
        int index = input.nextInt();
        System.out.println("Dati valoarea");
        int value = input.nextInt();
        array = addPosition(array, index, value);
        System.out.println("Dimensiunea finala : " + array.length);
        printArray(array);
    }

    public static void punctul5(Scanner input) {
        System.out.println("Dati dimensiune, pct 5 : ");
        int dim = input.nextInt();
        int[] array = readArray(input, dim);
        System.out.println("Al 2-lea element");
        System.out.println(largestNumber(extractElement(array, largestNumber(array))));//extrage cel mai mare elem din array

    }
    public static void punctul6(Scanner input) {
        System.out.println("Dati dimensiune, pct 6 : ");
        int dim = input.nextInt();
        int[] array = readArray(input, dim);
        System.out.println("Numere pare"+countEven(array));
        System.out.println("numere impare"+countOdd(array));

    }
    public static void punctul7(Scanner input){
        System.out.println("Citim lungime");
        int lungime=input.nextInt();
        System.out.println("citim latime");
        int latime=input.nextInt();
        for (int i = 0; i <latime; i++) {
            if(i==0||i==latime-1){
                for (int j = 0; j <lungime ; j++) {
                    System.out.print("*");
                }
            }

        else {
                for (int j = 0; j < lungime; j++) {
                    if (j == 0 || j == lungime - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }


    public static int[] addPosition(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[k] = value;
                k++;
            }
            newArray[k] = array[i];
            k++;
        }
        return newArray;
    }

    public static int[] readArray(Scanner input, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Array[" + (i + 1) + "]=");
            array[i] = input.nextInt();
        }
        return array;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int[] printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        return array;
    }

    public static int[] extractPosition(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }

    public static int largestNumber(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) { // comparam elementele din interiorul matricei
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int[] extractElement(int[] array, int value) {
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                continue;
            } else {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }

    public static int countEven(int[] array) {//metoda care gas nr pare
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static int countOdd(int[] array) {//metoda care gas nr impare=array-pare
        return array.length - countEven(array);
    }

}
