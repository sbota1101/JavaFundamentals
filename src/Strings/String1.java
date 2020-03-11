package Home.hello.array.ex;

public class String1 {
    // Java Program to count the total number of characters in a string
    public static void main(String[] args) {
        String a = "The best of both worlds";
        int i = 0;
        int count = 0;
        while (i < (a.length())) {
            if (a.charAt(i) != ' ') {
                count++;
            }
            i++;
        }
            System.out.println("The number of caract is"+" "+count);
    }
}
