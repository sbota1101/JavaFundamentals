package Strings;

public class string {
    public static void main(String[] args) {
        String Str = new String("Camelia are gogosi");
        System.out.println(Str.toUpperCase() );//transf scrisul in litere mari
        System.out.println(Str.toLowerCase() );//transf scrisul in litere mici
        String Str1=new String("Camelia are gogosi");
        String Str2= new String(Str1.replace('a', 'z'));
        System.out.println(Str2);
        boolean redval;
        redval= Str2.endsWith("gosi");
        System.out.println("redval is "+redval);
    }

}
