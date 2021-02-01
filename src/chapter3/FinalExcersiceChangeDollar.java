package chapter3;

import java.util.Scanner;

public class FinalExcersiceChangeDollar {

    public static void main(String args []){

        double max=1;

        //Enter your change
        System.out.println("Enter the quantities of coins");
        System.out.println("Pennies");
        Scanner scanner= new Scanner(System.in);
        int pennies = scanner.nextInt();

        System.out.println("Nickels");
        int nickels = scanner.nextInt();

        System.out.println("dimes");
        int dimes = scanner.nextInt();

        System.out.println("Quarters");
        int quarters = scanner.nextInt();

        //Total
        double total= (pennies*0.01)+ (nickels*0.05) + (dimes*0.10) + (quarters*0.25);

        //Comparison
         if (total>max){
            double over= total-max;
            System.out.println("You are exceed by $" + over + " dollars");
        } else if (total<max){
            double under= max-total;
            System.out.println("You are under by $" + under+ " dollars");
        }else
            System.out.println("Congratulations");
    }
}
