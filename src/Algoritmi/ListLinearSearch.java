package Algoritmi;

import java.util.ArrayList;
import java.util.List;

public class ListLinearSearch {


    public static void search(Integer n, List<Integer> array) {
        //for (int i = 0; i < array.size(); i++) {
            if (array.contains(n))
                System.out.println(array.indexOf(n));
            else
                System.out.println("-1");
       // }

    }

    public static void main(String[] args) {
        List<Integer>array=new ArrayList<>();
            array.add(2);
            array.add(5);
            array.add(7);
        search(5,array);


    }
}
