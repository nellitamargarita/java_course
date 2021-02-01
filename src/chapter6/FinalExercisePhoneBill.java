package chapter6;

import java.util.Scanner;

/**
 * Calculate the final total of someone's cell phone bill
 * Add the id of the bill, a base class, the number of minutes allotted and the number of minutes used
 */

public class FinalExercisePhoneBill {

    private int id;
    private char baseC;
    private int allottedMinutes;
    private int usedMinutes;

    public FinalExercisePhoneBill() {
        id=0;
        baseC='A';
        allottedMinutes= 800;
        usedMinutes= 800;
    }

    public FinalExercisePhoneBill(int id) {
        this.id=id;
        baseC='A';
        allottedMinutes= 800;
        usedMinutes= 800;
    }

    public FinalExercisePhoneBill(int id, char baseC, int allottedMinutes, int usedMinutes) {
        this.id=id;
        this.baseC=baseC;
        this.allottedMinutes=allottedMinutes;
        this.usedMinutes= usedMinutes;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public char getBaseC() {
        return baseC;
    }

    public void setBaseC(char baseC) {
        this.baseC = baseC;
    }

    public int getAllottedMinutes() {
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes) {
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public double calculateOverage(){
        if (usedMinutes<= allottedMinutes){
            return 0;
        }
        double overageRate = 0.25;
        double overageMinutes= usedMinutes- allottedMinutes;
        return overageMinutes;
    }

    public double tax(double fee){
        double tax1= (fee+calculateOverage())*15/100;
        return tax1;
    }

    public static double Total(double fee, double overage, double tax){
        double total= fee+overage+tax;
        return total;
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base: " + baseC);
        System.out.println("Overage Fee: $" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: $" + String.format("%.2f", tax(567)));
        System.out.println("Total: $" + String.format("%.2f", Total(567, calculateOverage(), tax(567))));
    }
}
