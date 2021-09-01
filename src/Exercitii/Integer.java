package Exercitii;

public class Integer {
    public static void main(String[] args) {
        int s = 74 + 36;
        System.out.println(s);
        float m = 50 / 3;
        System.out.println(m);
        int s1 = (-5 + (8 * 6));
        System.out.println(s1);
        int f = ((55 + 9) % 9);
        System.out.println(f);
        int g = (20 + ((-3 * 5) / 8));
        System.out.println(g);
        System.out.println(5 + 15 / ((3 * 2) - (8 % 3)));
         double abc=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(abc);
        //Write a Java program to print the area and perimeter of a circle: radius = 7.5
        System.out.println(area(7.5));
        System.out.println(perimetru(7.5));
        //Write a Java program that takes three numbers as input to calculate and print the average of
        //the numbers: 10, 20, 30-av=20;
        System.out.println(average(10,20,30));
       // Write a Java program to print the area and perimeter of a rectangle: Width = 5.5; Height = 8.5
        System.out.println(areaRectangle(5.5,8.5));
        System.out.println(perimetruRectangle(5.5,8.5));
        //  Write a Java program to swap two variables: a = 5; b = 13
        int c;
        int a=5;
        int b=13;
        c=a;
        a=b;
        b=c;
        System.out.println("a="+ a);
        System.out.println("b="+ b);
        //Write a Java program to compare two numbers and print if they are equal or different,
        //smaller, larger, smaller or equal, larger or equal: 25; 39
        int d=25;
        int e=39;
        if(d<e)
            System.out.println("true");
        else if (d>e)
            System.out.println("false");
        else if (d!=e)
            System.out.println("nu sunt egale");
        else
            System.out.println("nici una");
        //Write a Java program to compute the sum of the digits of an integer: 133
        int number=133;
        int sum=0;

        while(number!=0){
            int uc=number%10;
            sum+=uc;
            number=number/10;
        }
        System.out.println(sum);
    }
    public static double area(double radius){
        return (radius*radius*Math.PI);
    }
    public static double perimetru(double radius){
        return (2*radius*Math.PI);
    }
    public static int average(int a,int b,int c){
        int sum=a+b+c;
        return sum/3;
    }
    public static double perimetruRectangle(double lat,double lung){
        return (2*(lat+lung));
    }
    public static double areaRectangle(double lat,double lung){
        return (lat*lung);
    }


}
