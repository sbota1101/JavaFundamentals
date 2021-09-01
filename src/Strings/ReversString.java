package Strings;
//Write a method that reverses a string.
//        For example, 'java interview' becomes 'weivretni avaj'.
public class ReversString {
    public static String revers(String s){
        String result=" ";
        for (int i=0;i<s.length();i++){
            result=result+s.charAt(s.length()-i-1);
        }
        return result;
    }

    public static void main(String[] args) {
        String s="Java";
        System.out.println(revers(s));
    }
}
