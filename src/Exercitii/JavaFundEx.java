package Exercitii;

public class JavaFundEx {
    public static void main(String[] args) {
        //2.	Enter any value with several digits after the decimal point and assign it to variable of type double.
        // Display the given value rounded to two decimal places.
        double abc=235.4589;
        System.out.printf("%.2f%n",abc);
        //3.Display any three strings of characters on one line so that they are aligned to the right edge of the 15-character blocks.
        // How to align strings to the left edge?
        String string="Am plecat la vanatoare";
        String string2="sa vaneze caprioare";
        System.out.printf("%30s %-15s%n",string,string2);
        /*1.	Write a method that receives 2 string parameters and checks if the second string is contained by the first one.
        The method will return a boolean. Example: returns true for “The Witcher” and “Witcher”.
         */


        System.out.println( metoda1("the Witcher","Witcher"));
        System.out.println(metoda2("2 apples",2));
        System.out.println(metoda3(1,321));
    }

    public static boolean metoda1(String str1, String str2) {
        String s1 = "The Witcher";
        boolean s2 = s1.indexOf("Witcher") != -1 ? true : false;
        return s2;
    }
    /*2.	Write a method that receives 2 parameters, a string and an int, and checks if the int variable is contained by the string.
    The method will return a boolean. Example: returns true for string “2 apples” and int 2.
     */
    public static boolean metoda2(String s,int n){
        n=2;
         s="2 applets";
        boolean s3=s.contains(String.valueOf(n));
        return s3;
    }
    /*3.	Write a method that receives 2 integer parameters and check id the first int contains the second int.
    The method will return a boolean. Example: returns true for 123 and 1
     */
    public static boolean metoda3(int n,int m){
        n=1;
        m=123;
        int uc=0;
        while(m!=0) {
            uc = m % 10;
            if (uc == n) {
                return true;
            }
            m = m / 10;
        }
        return false;
    }
    }

