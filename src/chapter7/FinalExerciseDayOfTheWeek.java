package chapter7;

import java.util.Scanner;

public class FinalExerciseDayOfTheWeek {

    public static void main(String args[]){

        String[] says= {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int number=scanner.nextInt();
        switch (number){
            case 1: System.out.println(says[0]);
                break;
            case 2: System.out.println(says[1]);
                break;
            case 3: System.out.println(says[2]);
                break;
            case 4: System.out.println(says[3]);
                break;
            case 5: System.out.println(says[4]);
                break;
            case 6: System.out.println(says[5]);
                break;
            case 7: System.out.println(says[6]);
                break;
            default:System.out.println("Invalid number");
                break;
        }
    }
}
