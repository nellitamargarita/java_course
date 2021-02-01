package chapter3;

import java.util.Scanner;

/**
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short
 */

public class QuotaCalculator {
    public static void main(String args[]) {
        //Initialize values we know
        int quota = 10;

        //Get unknown values
        System.out.println("Enter the number of sales");
        Scanner scanner = new Scanner(System.in);
        int numberOfSales = scanner.nextInt();
        scanner.close();

        //Make a decision on the path to take - Output
        if (numberOfSales >= quota) {
            System.out.println("Congratulations");
        } else {
            int salesShort = quota - numberOfSales;
            System.out.println("You need to do " + salesShort + " sales");
        }
    }
}
