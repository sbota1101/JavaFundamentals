package Algoritmi;


import java.util.Scanner;

public class complex {
    //Program to calculate the area and perimeter of a given figure.
    //1. Display the following in the console:
    //
    //    1. Patrat
    //    2. Cerc
    //    3. Triunghi echilateral
    //    4. Exit
    //2. Read the option from the console and store the value in a variable.
    //3. Using a do while loop display and read the option until the option is 4.
    //4. If the user inputs an option value other than 4: display and read the defining parameter for each figure.
    //    Read the in case needed values:
    //        a. for Patrat read latura
    //        b. for Cerc read raza
    //        c. for triunghi read latura
    //5. Create 2 methods
    //        a. public Double area(String figure, Double paramater)
    //        b. public Double perimeter(String figure, Double paramater)
    //    In the methods above the figure is the type of figure (cerc,patrat,triunghi) and parameter is the in case needed parameter.
    //    Ex cerc neede raza, patrat needes latura and triughi needs latura in order to calculate the area and perimeter.
    //6. Using the 2 methods from point 5 display the values to the user.    Please format the value using printf: only display 2 decimals.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Patrat \n 2. Cerc\n 3. Triunghi echilateral\n 4.Exit\n\nOption: ");
        int option = Integer.parseInt(input.nextLine());
        while(option != 4) {
            switch (option) {
                case 1: {
                    System.out.println("Dati latura patratului: ");
                    double latura = Double.parseDouble(input.nextLine());
                    System.out.printf("Aria este:%.2f\n", area("patrat", latura));
                    System.out.printf("Perimetrul este:%.2f\n\n",perimeter("patrat",latura));
                }
                break;
                case 2: {
                    System.out.println("Dati raza cercului: ");
                    double raza = Double.parseDouble(input.nextLine());
                    System.out.printf("Aria este:%.2f\n", area("cerc", raza));
                    System.out.printf("Perimetrul este:%.2f\n\n",perimeter("cerc",raza));
                }
                break;
                case 3: {
                    System.out.println("Dati latura triunghiului: ");
                    double latura = Double.parseDouble(input.nextLine());
                    System.out.printf("Aria este:%.2f\n", area("triunghi", latura));
                    System.out.printf("Perimetrul este:%.2f\n\n",perimeter("triunghi",latura));
                }
                break;
                default: {
                    System.out.println("Optiune incorecta!!!!Alegeti o valoare de la 1-4!");
                }
            }
            System.out.println("Option: ");
            option = Integer.parseInt(input.nextLine());
        }
    }
    public static Double area(String figure, Double parameter){
        if(figure.equalsIgnoreCase("patrat")){
            return Math.pow(parameter,2);
        }else if(figure.equalsIgnoreCase("cerc"))
            return (Math.pow( parameter, 2)*3.14);
        else{
            return (Math.pow(parameter,2)*Math.sqrt(3)/4);
        }
    }
    public static Double perimeter(String figure, Double parameter){
        if(figure.equalsIgnoreCase("patrat")){
            return (parameter*4);
        }else if(figure.equalsIgnoreCase("cerc"))
            return (2*3.14*parameter);
        else{
            return (3*parameter);
        }
    }
}

