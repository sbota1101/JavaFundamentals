package a3ajava;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tema {
    //Program to find letters, numbers, words and sentences in a given text.
    //    Your program should support the following operations and display a menu to choose your option:
    //Count the total number of letters in the text
    //Count all words that contain a double l
    //Print all words that contain a double l that is not followed by an o character
    //Print all sentences that have 5 words exactly
    //Compute and print the sum for all the numbers that appear in the text
    //(Bonus) Print the last three letters in all the 6 letter words that start with a vowel.
    //        0. Exit"
    //
    //
    //Hints:
    //For the sample text, you should find there are 2451 letters
    //Would be useful to use an incrementing counter
    //Digits are not letters :)
    //For the sample text there are 11 such words
    //Words can start / end with double l (lower case L)
    //For the sample text there are 7 such words
    //Allibaba should match
    //Alloha should not match
    //For the sample text: you should find there are 6 such sentences
    //Sentences start with a capital letter
    //Sentences end with a period (”.”)
    //A number counts as 1 word (123 is a number with 3 digits, is still considered 1 word)
    //For the sample text, sum is 278.51
    //Numbers can have a decimal parts as well (1.3)
    //For the sample text: you should find there are 7 such words
    //Vowels are : a, e, i, o, u
    //Might be helpful to include word delimiters in your search pattern
    //Don’t forget about capital letters
    //
    //
    //We can start with printing the menu
    //Next step we would read the option
    //A switch could help with separate logic for each of the options
    //To do regex pattern matching in java we need to:
    //Define the regex as String
    //Create a Pattern
    //Get a Matcher from the Pattern
    //You can use https://regex101.com website to help with regexes
    //You can paste in the full text from below
    //Since each of the options will require different regexes we will need to define a new Pattern + Matcher for every option separately
    //Optional* - A method that takes a regex String as an argument and returns a Matcher might help reduce code duplication

    public static void main(String[] args) {
        String input = " Ibidem quaerantur si faciliorem ac detorqueat. Novas si puram gi vulgo. Facit bonus re credo ut de major inter ob. Eaedem educta ac is dubito vitiis. Durationem tractandae perspicuum to at ad inusitatis objectivam ab. Co ac ad innumeras ac consuetae cunctatus purgantur dormienti.\n" +
                "Jam uno invenero extensum nocturna pluribus dei falleret confidam. Virorum seipsum vim quomodo qua inferri saporis memores. \n" +
                "\n" +
                "Alteram tanquam creatis viribus at si.\n" +
                "Maximam vos hoc antehac imo ignotas 19 eae aliarum fictile. Excludat is potestis me du si cognitio liberius. Sum quae rem meae male haec. Fallacem totamque at loquebar formemus suspicio ex me ne. Haereo mutata dum vix magnum tertia volunt nam suo audita. \n" +
                "\n" +
                "Dubitavit terminari to meditabor nonnullae ei potuerunt consortio ad ac. Junctas poterit ordinem fatigor ab ut quiddam subesse co.\n" +
                "Desuescam remanetne consortio quibusdam ab 7 de theologos. Ne petitis re ultimam dormiam ha vi. Tales firma favis earum venit ea ha haben.\n" +
                "Discrepant concipitur iis 129 diversitas. Longe denuo ea id porro. Incertas mo exemplum existere in. Per mutationem concipitur nam sit rea dulcedinem perfectior industriam parentibus. \n" +
                "\n" +
                "Ipsi ullO visu ipse to 12.51 boni et cera si. Veri hoc ego voce uti sumi. Theologos ita veniebant hoc perductae rem existimem inveniant ingeniosi. Ego vere heri spem dico ego. Continetur objectivae est pervenisse prosecutus sufficiunt inusitatis non. Altius ei ea ii totius terram notior vi. Cernitur deponant mutuatis perfecta potentia regendae ad in ex. \n" +
                "\n" +
                "Coelum majora quibus: adesse; quo; hoc; rum nomine multum.\n" +
                "Concipiam generales extitisse eas opportune procuravi per fal posuerunt. Eam falso via aeque ipsum oculi omnem. Finitus iis ope humanae ita sum constet ideoque. Usurpabam arrogetur sed scriptura duo ego denegante.\n" +
                "Pendeant effectus scriptis fal eam ens. Alloquendo in me du dubitandum conspicuum durationem desiderant.\n" +
                "Ac putandum tollatur singulis supersit at possimus ageretur. \n" +
                "\n" +
                "Vis viribus indutos cur ostendi usitate. Du quapropter ac de majestatis dissimilem conflantur falsitatem. Continere iis eversioni sequentia generales acquirere sic agi. Cum veritas vestrae 111 dicerem mem plausum exsolvi suppono. Cum nunc omne unde vita una vul hoc veri. Reipsa qui tam falloam his ego lor. Du ab ex fuse re addo quos prae. Ob superest immittit si ignorans si. Rea componi tam existam limites optimae ponamus. \n" +
                "\n" +
                "Potuerit scriptis fenestra judiciis si reperire quidquam at. Aliquandiu aucupantur vix intelligat sub. Nego anno et inge ipsa re regi opus. Re ferant revera dictam in primae facile at habent ex. Distinguo res ita purgantur vul percipior. Fronte inesse tamdiu ei notior ex. \n" +
                "\n" +
                "Vis declarare ll debiliora duo infinitum nam. Certi nolle supra his imo imo. Dari sibi id ea casu. Captivus hoc occurrit quanquam etc totamque fallebar. Pendeant refutent pro incipere iii nul percipio.\n" +
                "Arrogetur persuadeo sit examinare sex opportune. Sub ista hic sed eae sine sive heri. Longum ferant existi simili est dubias nul melius deo.\n ";
        Scanner in = new Scanner(System.in);
        System.out.println("Optiune is:");
        int optiune;
        do {
            System.out.println("1. Count the total number of letters in the text");
            System.out.println("2. Count all words that contain a double l");
            System.out.println("3. Print all words that contain a double l that is not followed by an o character ");
            System.out.println("4. Print all sentences that have 5 words exactly");
            System.out.println("5. Compute and print the sum for all the numbers that appear in the text");
            System.out.println("6. (Bonus) Print the last three letters in all the 6 letter words that start with a vowel.");
            System.out.println("0.Exit");
            System.out.println("Please select an option:");
            optiune = Integer.parseInt(in.nextLine());
            switch (optiune) {
                case 1:
                    String regex1 = "[a-zA-Z]";
                    int count1 = 0;
                    //        create a Pattern object
                    Pattern pattern1 = Pattern.compile(regex1);
                    //        create matcher object.
                    Matcher matcher1 = pattern1.matcher(input);
                    while (matcher1.find()) {
                        count1++;
                    }
                    System.out.println(count1 + " letter found");
                    break;
                case 2:
                    String regex2 = "l{2}";
                    int count2 = 0;
                    Pattern pattern2 = Pattern.compile(regex2);
                    Matcher matcher2 = pattern2.matcher(input);
                    while (matcher2.find()) {
                        count2++;
                    }
                    System.out.println(count2 + "words found");
                    break;
                case 3:
                    int count3 = 0;
                    String regex3 = ("(\\w+.l{2}(?!o)\\w+)");
                    String[] arrayOfStrings = new String[7];
                    Pattern pattern3 = Pattern.compile(regex3);
                    Matcher matcher3 = pattern3.matcher(input);
                    while (matcher3.find()) {
                        count3++;
                        System.out.println(matcher3.group());
                    }
                    System.out.println(count3);
                    break;
                case 4:

                    String regex4 = "[A-Z]\\w+\\s\\w+\\s\\w+\\s\\w+\\s\\w+[.]";

                    Pattern pattern4 = Pattern.compile(regex4);
                    Matcher matcher4 = pattern4.matcher(input);
                    while (matcher4.find()) {

                        System.out.println(matcher4.group());
                    }
                    break;
                case 5:
                    double sum = 0;
                    String regex5 = "(([0-9]+[.][0-9]+)|[0-9]+)";
                    Pattern pattern5 = Pattern.compile(regex5);
                    Matcher matcher5 = pattern5.matcher(input);
                    while (matcher5.find()) {

                        System.out.println(matcher5.group());

                        sum += Double.parseDouble(matcher5.group());
                    }

                    System.out.println(sum);
                    break;
                case 6: {
                    String regex = "(\\b[aeiouAEIOU]\\w{2}(\\w{3})\\b)";
                    Pattern pattern = Pattern.compile(regex);
                    Matcher matcher = pattern.matcher(input);
                    int words = 0;
                    String original = "";
                    String last3Letters = "";
                    while (matcher.find()) {
                        words++;
                        original = original + "  -" + matcher.group(1);
                        last3Letters = last3Letters + "  -" + matcher.group(2);
                    }
                    System.out.println("----6 letter words that start with a vowel: " + original);
                    System.out.println("\n----The last 3 letters from all the 6 letter words that start with a vowel: " + last3Letters);
                }
                break;
                default:
                    System.out.println("Not an option, Reselect");
            }
            System.out.println("Please select an option: ");
            optiune = Integer.parseInt(in.nextLine());
        } while (optiune != 0);


    }
}