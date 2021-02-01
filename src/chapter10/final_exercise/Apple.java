package chapter10.final_exercise;

public class Apple extends Fruit{

    public Apple(double calories) {
        super(60);
    }

    public void removeSeeds(){
        System.out.println("You need to remove the seeds");
    }

    @Override
    public void makeJuice() {
        System.out.println("This juice is of Apple");
    }
}
