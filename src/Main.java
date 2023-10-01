import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int cost = 0;
        double tax = 0.02;
        double taxCost;
        System.out.println("What is the price of your item?");
        cost = scan.nextInt();
        taxCost = cost * tax;

        if (cost <= 100) {
            System.out.println("Your total is $" + (cost + taxCost));
        }
        else {
            System.out.println("Your total is $" + cost);
        }
    }
}