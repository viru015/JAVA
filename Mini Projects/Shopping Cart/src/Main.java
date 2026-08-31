
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        String name;
        int qty;
        double price;
        double total;
        String currency;
        boolean cont;

        System.out.print("WHAT'S YOUR NAME :");
        name = scanner.nextLine();

        System.out.printf("HELLO %s WHAT WOULD YOU LIKE TO BUY :" , name);
        item = scanner.nextLine();

        System.out.printf("HOW MANY %s/S WOULD YOU LIKE :", item);
        qty = scanner.nextInt();
        scanner.nextLine();

        System.out.print("PLEASE SELECT YOUR CURRENCY :");
        currency = scanner.nextLine();

        System.out.print("WHAT'S THE PRICE FOR EACH :");
        price = scanner.nextDouble();

        total = qty*price;
        System.out.printf("YOUR TOTAL WILL BE %s %.1f\n" ,currency, total);

        System.out.print("WOULD YOU LIKE TO CONTINUE :");
        cont = scanner.nextBoolean();

        if(cont){
            System.out.print("THANKS FOR SHOPPING\nPLEASE VISIT AGAIN !!");


        }
        else{
            System.out.print("YOUR ORDER HAS BEEN CANCELLED\nPLEASE VISIT AGAIN !!");
        }






        scanner.close();

    }

}
