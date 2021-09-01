package Strings;

public class String3 {
    //Java Program to count the total number of vowels and consonants in a string
    public static void main(String[] args) {
        String a="This is a really simple sentence";
        String b=new String("This is a really simple sentence");
        b=a.toLowerCase();
        System.out.println(b);
        int count1=0;
        int count2=0;
        for (int i = 0; i < b.length(); i++) {

            if ((b.charAt(i)=='a')||(b.charAt(i)=='e')||(b.charAt(i)=='i')||(b.charAt(i)=='o')||(b.charAt(i)=='u')){
                count1++;}
            else if(b.charAt(i) >= 'a' && b.charAt(i)<='z') {
                count2++;}
        }
        System.out.println("Vocale number is"+count1);
        System.out.println("Consoane number is"+count2);
    }
}
