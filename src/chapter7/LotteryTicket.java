package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int length= 6;
    private static final int max_ticket_number= 69;

    public static void main(String args[]){
        int [] ticket= generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[length];

        Random random = new Random();

        for (int i=0; i<length; i++){
            int randomNumber;

            do {
                randomNumber= random.nextInt(max_ticket_number) + 1;
            } while (search(ticket,randomNumber));
            ticket[i]= randomNumber ;
        }
        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor){
        //This is called an enhanced loop
        for (int value: array){
            if(value== numberToSearchFor){
                return true;
            }
        }
        return false;
    }

    public static void printTicket(int [] ticket){
        for (int i=0; i<length;i++){
            System.out.print(ticket[i] + "|");
        }
    }
}
