package Algoritmi;
import java.util.*;
//Write a class named AsciiCharSequence for storing ASCII-character sequences, that should:
//implement the interface java.lang.CharSequence;
//have a constructor that takes a byte array;
//have methods length, charAt, subSequence, and toString.
//You can find the declaration of methods and their behavior in the description of java.lang.CharSequence (JavaDoc or sources).
//Carefully check signatures of abstract methods of java.lang.CharSequence interface, especially subSequence method. It accepts 2 integers: start index (inclusive) and end index (!exclusive). The method returns an object of a class that implements java.lang.CharSequence interface.
// For example, it can be an instance of AsciiCharSequence class.
class AsciiCharSequence implements CharSequence {
    // implementation
    private byte[]array;
    public AsciiCharSequence(byte[]array) {
        this.array=array;
    }
    @Override
    public char charAt(int index){
        return (char)array[index];
    }
    @Override
    public int length(){
        return array.length;
    }
    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] target = new byte[end - start];
        for (int i = 0, j = start; j < end && j < array.length; i++, j++) {
            target[i] = array[j];
        }
        return new AsciiCharSequence(target);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (byte value : array) {
            builder.append((char) value);
        }
        return builder.toString();
    }

}
