package ExerciceJavaAdv;

public class Main {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper("Robert", 25);
        System.out.println(javaDeveloper);
        System.out.println(javaDeveloper.sum(2, 3));
        Developer developer = new Developer("Maria", 30);

        System.out.println( developer.hello("hello", 5));
        System.out.println(developer.hello("hello"));
    }

}
