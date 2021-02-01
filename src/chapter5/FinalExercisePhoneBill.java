package chapter5;

import java.util.Scanner;

/**
 * Calculate the final total of someone's cell phone bill
 */

public class FinalExercisePhoneBill {

    public static void main(String args[]){

        //Input data
        System.out.println("Introduce your plan fee");
        Scanner scanner = new Scanner(System.in);
        double fee= scanner.nextDouble();

        System.out.println("Introduce the number of overage minutes");
        int minutes= scanner.nextInt();

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + fee);
        //Overage fees
        double overage =overageFees(minutes);
        System.out.println("Overage: $" + overage);
        //Tax
        double tax= tax(fee, overage);
        System.out.println("Tax: $" + tax);
        //Total
        double total= Total(fee, overage, tax);
        System.out.println("Total: $" + total);
    }

    public static double overageFees(int minutes){
        double overageF= minutes* 0.25;
        return overageF;
    }

    public static double tax(double fee, double overage){
        double tax1= (fee+overage)*15/100;
        return tax1;
    }

    public static double Total(double fee, double overage, double tax){
        double total= fee+overage+tax;
        return total;
    }
}
