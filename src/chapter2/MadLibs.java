package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String arg[]){

        System.out.println("Introduce a season of the year");
        Scanner scanner= new Scanner(System.in);
        String season= scanner.next();
        System.out.println("Introduce an integer number");
        int number = scanner.nextInt();
        System.out.println("Introduce an adjective");
        String adjective= scanner.next();

        System.out.println("On a " + adjective +" " + season + " day, I drink a minimum of "+  number + " cups of coffee");

    }
}
