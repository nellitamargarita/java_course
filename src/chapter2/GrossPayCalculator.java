package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String arg[]){
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double pay = scanner.nextDouble();

        //3. Multiply hours and pay rate
        double mult= hours * pay;

        //4. Display result
        System.out.println("The employee grosspay is $" + mult);
    }
}
