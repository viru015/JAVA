import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        String name;

        double temp;

        double temp1;

        String unit;



        System.out.print("ENTER YOUR NAME :");

        name = scanner.nextLine();
        name = name.toUpperCase();

        System.out.printf("HELLO %s\nENTER THE TEMPERATURE :", name);
        temp = scanner.nextDouble();

        System.out.print("CONVERT TO FAHRENHEIT OR CELSIUS(F or C) :");
        unit = scanner.next().toUpperCase();

        // (condition) ? "true":""false

        temp1 = (unit.equals("C")) ? (temp -32 )*5.0/9.0 : (temp*9.0/5.0) + 32 ;


        System.out.printf("THATS %.1f%s \n", temp1,unit);






        scanner.close();

    }
}
