package chapter9;

import java.util.Scanner;

public class FinalExerciseTasteTester {

    public static void main(String[] args){

        FinalExerciseCake cake= new FinalExerciseCake("Chocolate");
        cake.setPrice(29);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        FinalExerciseBirthdayCake birthdayCake= new FinalExerciseBirthdayCake();
        birthdayCake.setPrice(49);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        FinalExerciseWeddingCake weddingCake= new FinalExerciseWeddingCake();
        weddingCake.setFlavor("pina colada");
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }

}
