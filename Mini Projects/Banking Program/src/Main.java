import java.util.Scanner;
public class Main{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //JAVA BANKING PROGRAM

        double balance = 0;
        int output;
        boolean isRunning = true;

        while(isRunning){
            System.out.println("___________________________________");
            System.out.println("WELCOME TO OUR BANKING PROGRAM");
            System.out.println("___________________________________");
            System.out.println("1) CHECK BALANCE");
            System.out.println("2) DEPOSIT");
            System.out.println("3) WITHDRAW");
            System.out.println("4) EXIT");
            System.out.println("___________________________________");

            System.out.print("ENTER YOUR CHOICE :");
            output = scanner.nextInt();

            switch(output){
                case 1 -> checkBalance(balance);
                case 2 ->{balance +=deposit();
                    checkBalance(balance);}

                case 3 -> {balance -=withdraw(balance);
                    checkBalance(balance);}

                case 4 -> isRunning = false;
                default  -> System.out.println("INVALID CHOICE !!");
            }
        }
        System.out.println("___________________________________");
        System.out.println("THANKS YOU \nHAVE A NICE DAY !!");
        System.out.println("___________________________________");

        scanner.close();
    }
    static void checkBalance(double balance){
        System.out.printf("AVL. BALANCE :%.2f\n" , balance);
    }
    static double deposit(){

        double amount;
        System.out.print("ENTER AN AMOUNT TO DEPOSIT :");
        amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("AMOUNT CANT BE NEGATIVE");
            return 0;
        }
        else return amount;
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("ENTER AMOUNT TO WITHDRAW :");
        amount = scanner.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS !!");
            return 0;
        }
        else if(amount <0 ){
            System.out.println("INVALID AMOUNT !!");
            return 0;
        }
        else return amount;
    }

}