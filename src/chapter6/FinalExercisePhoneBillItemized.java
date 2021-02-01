package chapter6;

public class FinalExercisePhoneBillItemized {

    public static void main(String args[]){
        FinalExercisePhoneBill test = new FinalExercisePhoneBill(45567);
        test.setUsedMinutes(1000);
        test.printItemizedBill();
    }
}
