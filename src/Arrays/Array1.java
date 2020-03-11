package Home.hello.array.ex;

import javax.swing.*;

public class Array1 {
    //Java Program to find the frequency of each element in the array
    public static void main(String[] args) {
        //Initializare array
        int[] array = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        //Array fr will store frequencies of element
        int[] fr = new int[array.length];
        int count = 0;
        int visited = -1;
        for (int i = 0; i < array.length; i++) {
            count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;//ca sa nu numararm aceleasi elem
                    fr[j] = visited;
                }
            }

            if (fr[i] != visited) {
                fr[i] = count;
            }
        }
                //Displays the frequency of each element present in array
                System.out.println("---------------------------------------");
                System.out.println(" Element | Frequency");
                System.out.println("---------------------------------------");
                for(int i = 0; i < fr.length; i++){
                    if(fr[i] != visited)
                        System.out.println("    " + array[i] + "    |    " + fr[i]);
                }
                System.out.println("----------------------------------------");


    }
}
