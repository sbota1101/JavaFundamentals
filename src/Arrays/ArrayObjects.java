package javaFund1;

public class array1 {
    public static void main(String[] args) {
        Object[]arrayOfObjects = new Object[3];
        arrayOfObjects[0]=1;
        arrayOfObjects[1]=2.0d;
        arrayOfObjects[2]="ana are mere";
        /*
         * if int print hexa
         * if double print 3 decimals
         * else print as string
         */


        for(Object o : arrayOfObjects){
            if( o instanceof Integer){
                System.out.printf("%08x%n", o);}
            else if (o instanceof Double){
                System.out.printf("%.3f%n", o);}
            else{
                System.out.println(o);
            }

        }


    }
}
