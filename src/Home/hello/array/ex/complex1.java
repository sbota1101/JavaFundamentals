package Home.hello.array.ex;

import java.util.Scanner;

public class complex1 {
    public static void main(String[] args) {
        String opt = "";
        String param;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("1. Patrat");
            System.out.println("2. Cerc");
            System.out.println("3. Triunghi echilateral");
            System.out.println("4. Exit");
            System.out.println("Option:");
            opt = in.nextLine();
            switch (opt) {
                case "1":
                case "3":
                    System.out.print("Latura:");
                    break;
                case "2":
                    System.out.print("Raza:");
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Optiune invalida");
                    continue;
            }
            param = in.nextLine();
            System.out.printf("%n Aria %.3f",  aria(opt, param));
            System.out.printf("%n Perimetru %.3f",  perimetru(opt, param));
        } while (!"4".equalsIgnoreCase(opt));
    }
    private static Double perimetru(String type, String param) {
        switch (type) {
            case "1":
                return 4 * Double.parseDouble(param);
            case "2":
                return 2 * Math.PI * Double.parseDouble(param);
            case "3":
                return 3 * Double.parseDouble(param);
            default:
                return 0.0d;
        }
    }
    private static Double aria(String type, String param) {
        switch (type) {
            case "1":
                return Math.pow(Double.parseDouble(param), 2);
            case "2":
                return Math.PI * Math.pow(Double.parseDouble(param), 2);
            case "3":
                return Math.pow(Double.parseDouble(param), 2) * Math.sqrt(3) / 2;
            default:
                return 0.0d;
        }
    }
}
