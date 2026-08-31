import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nmbr1;
        double nmbr2;
        char oprn;
        double total =0;
        boolean valid = true;
        System.out.print("ENTER THE NUMBER :");
        nmbr1 = scanner.nextInt();
        System.out.print("SELECT THE OPERATOR(+,-,*,/,^) :");
        oprn = scanner.next().charAt(0);
        System.out.print("ENTER THE OTHER NUMBER :");
        nmbr2 =scanner.nextInt();

        switch(oprn) {
            case '+' -> total = (nmbr1 + nmbr2) ;
            case '-' -> total = (nmbr1 - nmbr2) ;
            case '*' -> total = (nmbr1 * nmbr2) ;
            case '/' -> {
                if (nmbr2 == 0){
                    System.out.println("CANNOT DIVIDE BY ZERO");
                    valid = false;
                }
                else {
                    total = (nmbr1 / nmbr2);
                }
            }
            case '^' -> total = Math.pow(nmbr1 , nmbr2);
            default -> {
                System.out.print("INVALID OPERATOR !!");
                valid = false;
            }

        }

        if (valid) {
            System.out.printf("%.2f", total);
        }





        scanner.close();
    }
}
