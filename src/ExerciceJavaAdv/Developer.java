package ExerciceJavaAdv;

public class Developer extends Person {
    public int c;

    public Developer(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    protected int sum(int a, int b) {
        return a + b;
    }

    public String hello(String s,int a) {
        return s.toString()+a;
    }
}
