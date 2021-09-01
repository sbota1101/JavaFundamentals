package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a Java program to retrieve an element (at a specified index) from a given array list
public class ArrayList1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti pozitia");
        int n= scanner.nextInt();
        List<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Before"+" "+cars);
        for (int i = 0; i < cars.size(); i++) {
            if(i==n){
                //cars.set(i,"Mercedes");
                System.out.println(cars.get(n));
            }
        }
        System.out.println("After"+" "+cars);
    }
}
