import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        String name;

        double temp;

        double temp1;

        int output;



        System.out.print("ENTER YOUR NAME :");

        name = scanner.nextLine();
        name = name.toUpperCase();


        System.out.printf("HELLO %s \nWELCOME TO OUR TEMPERATURE CONVERTER\n", name);

        System.out.print("1) CELSIUS TO FAHRENHEIT\n2) FAHRENHEIT TO CELSIUS\nCHOOSE A METHOD OF CONVERSION :");

        output = scanner.nextInt();


        if(output == 1){

            System.out.print("ENTER THE TEMPERATURE (IN CELSIUS) :");

            temp = scanner.nextInt();

            temp1 = (temp * ( 9.0 / 5.0 )) + 32;

            System.out.printf("%f°c IS EQUAL TO %f FAHRENHEIT", temp,temp1);

            System.out.print("");
        }

        else if(output == 2){

            System.out.print("ENTER THE TEMPERATURE (IN FAHRENHEIT) :");

            temp = scanner.nextInt();

            temp1 =  (temp - 32 )* 5.0 / 9.0;

            System.out.printf("%.1f FAHRENHEIT IS EQUAL TO %.1f°c ", temp ,temp1);

        }



        scanner.close();

    }
}


