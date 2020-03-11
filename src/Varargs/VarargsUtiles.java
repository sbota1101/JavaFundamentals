package ro.sdaacademy.javafundamentals.varargs;

public class VarargsUtiles {
    public static int getSum (int... args) {
        int sum=0;
        for (int arg:args){
            sum+=arg;
        }
        return sum;
    }
}
