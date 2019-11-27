package javaFund1;

public class arrays2 {
    public static void main(String[] args) {
        int [][] a= {
                {1,2,3},
                {4,5,6,9},
                {7},
        };//se afiseaza o matrice

        for (int i=0; i<a.length; i++){

            for( int j: a[i]){
                    System.out.println(j);
            }
        }
    }
}
