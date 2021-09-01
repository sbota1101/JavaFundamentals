package Exercitii;

public class Letter {
    //Write a Java program to count the letters, spaces, numbers and other characters of an input
    //string: Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33
    public static void main(String[] args) {
        String s = "Aa kiu, I swd skieo 2387. GH kiu: sieo?? 25.33";
        char[] arrays = s.toCharArray();
        int nr = 0;
        int letter = 0;
        int spaces = 0;
        int count = 0;
        for (int i = 0; i < arrays.length; i++) {

            if (Character.isLetter(arrays[i]))
                letter += 1;
            else if (Character.isDigit(arrays[i]))
                nr += 1;
            else if (Character.isSpaceChar(arrays[i]))
                spaces += 1;
            else
                count += 1;
        }
        System.out.println("Number are : " + nr);
        System.out.println("Letters are:" + letter);
        System.out.println("Spaces are:" + spaces);
        System.out.println("Others are:" + count);
    }
}
