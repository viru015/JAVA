import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        //number guessing game
        int number;
        int min;
        int max;

        int attempts =0;

        System.out.print("WELCOME TO OUR NUMBER GUESSING GAME\n");
        System.out.print("SELECT YOUR RANGE OF GUESS\n");
        System.out.print("MIN :");
        min=scanner.nextInt();
        System.out.print("MAX :");
        max=scanner.nextInt();

        int randomNumber = random.nextInt(min,max+1);



        do{
            System.out.print("GUESS THE NUMBER :");
            number = scanner.nextInt();
            attempts++;

            if(randomNumber > number){
                System.out.println("ITS A LITTLE LOW !! GUESS HIGH !!");
            }
            else if (randomNumber < number){
                System.out.println("ITS A LITTLE HIGH !! GUESS LOW !!");
            }
            else {
                System.out.printf("\nCORRECT !! \nTHE NUMBER WAS %s" , randomNumber);
                System.out.printf("\nIT TOOK YOU %d ATTEMPTS" , attempts);
            }
        }while(number != randomNumber);


        scanner.close();
    }
}