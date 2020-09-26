import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.print("Amount : ");
        double amount = x.nextDouble();
        amount = amount * 100;

        int quart = (int) amount / 25;
        System.out.println("\nQuarters : " + quart);
        amount = amount % 25;

        int dime = (int) amount / 10;
        System.out.println("Dimes    : " + dime);
        amount = amount % 10;

        int nick = (int) amount / 5;
        System.out.println("Nickels  : " + nick);
        amount = amount % 5;

        int pen = (int) amount;
        System.out.println("Pennies  : " + pen);

    }
}
