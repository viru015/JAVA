import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        String name;
        double amt;
        double intr;
        int time;
        int years;
        double ci;

        System.out.print("ENTER YOUR NAME :");
        name = scanner.nextLine();

        System.out.printf("HELLO %s \nENTER THE AMOUNT (in $):" , name );
        amt= scanner.nextDouble();

        System.out.print("ENTER THE INTEREST (in%):");
        intr = scanner.nextDouble() / 100;

        System.out.print("ENTER THE NUMBER OF TIMES COMPOUNDED :");
        time = scanner.nextInt();

        System.out.print("NUMBER OF YEARS :");
        years = scanner.nextInt();


        ci = amt * Math.pow((1 +  (intr / time) ), time * years );

        System.out.printf("%s THE TOTAL AMOUNT AFTER %d YEARS IS %,.2f $" , name, years , ci );






        scanner.close();


    }
}