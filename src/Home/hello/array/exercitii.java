package Home.hello.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercitii {
    public static void main(String[] args) throws IOException
    {
        System.out.print ("Introduceti un numar=");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        Double a = Double.parseDouble(s);
        System.out.println("a =");
        System.out.printf("%.3f%n", a);

    }

   
}

