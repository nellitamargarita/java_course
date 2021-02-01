package chapter4;

import java.util.Random;

public class FinalExerciseGame {

    public static void main(String args[]){

        int spaces=20;
        int rolls= 5;
        int currentSpace=0;

        Random random= new Random();

        for (int i=1; i<rolls; i++){
            int die = random.nextInt(6) +1;
            currentSpace=currentSpace+die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if (currentSpace == spaces){
                System.out.println("You're on space " + currentSpace+ ". Congrats, you win");
                break;
            }
            else if (currentSpace>spaces){
                System.out.println("Unfortunately, that takes you past " + spaces + " spaces. You lose!");
                break;
            }
            else if (i==rolls && currentSpace<spaces){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all "+ spaces+ " spaces. You lose!");
            }
            else {
                int spacesToGo= spaces-currentSpace;
                System.out.println("You are now on space "+ currentSpace+ " and have " +spacesToGo+ " more to go.");
            }
            System.out.println();
        }
    }
}
