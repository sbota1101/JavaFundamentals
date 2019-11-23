package a3ajava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternEx1 {

        public static void main(String[] args) {
            String input = "Over fact all son tell this any his. No 0777 777 777 insisted confined of weddings to returned to debating rendered.";
            String regex = "(\\(?(0|\\+\\d{2})\\d{3}\\)?\\s?\\d{3}\\ ?(\\d{3})\\s)";
//        create a Pattern object
            Pattern pattern = Pattern.compile(regex);
//        create matcher object.
            Matcher matcher = pattern.matcher(input);
//        compares pattern against whole string
            System.out.println(matcher.matches());
//        searches for pattern in string
//        System.out.println(matcher.find());
            String ultimeleTreiCifreDinTelefon = " ";
            int numereDeTelefon = 0;
            while(matcher.find()) {
                numereDeTelefon++;
                System.out.println(matcher.group(1));
                System.out.println(matcher.group(2));
                ultimeleTreiCifreDinTelefon = matcher.group(3);
                System.out.println(ultimeleTreiCifreDinTelefon);
                System.out.print("Group count: ");
                System.out.println(matcher.toMatchResult().groupCount());
                System.out.print("Start result string index: ");
                System.out.println(matcher.toMatchResult().start());
                System.out.print("End result string index: ");
                System.out.println(matcher.toMatchResult().end());
                System.out.println(input.substring(matcher.toMatchResult().start(), matcher.toMatchResult().end()));;
            }
            System.out.println(ultimeleTreiCifreDinTelefon);
        }
    }

