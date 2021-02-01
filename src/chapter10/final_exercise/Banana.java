package chapter10.final_exercise;

public class Banana extends Fruit{

    public Banana(double calories) {
        super(40);
    }

    public void peel(){
        System.out.println("You need to peel the banana");
    }

    @Override
    public void makeJuice() {
        System.out.println("This juice is of banana");
    }
}
