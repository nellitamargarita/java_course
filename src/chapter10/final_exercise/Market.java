package chapter10.final_exercise;

public class Market {

    public static void main(String[] args){

        Fruit app= new Apple(40);
        System.out.println(app.calories);
        app.makeJuice();
        ((Apple) app).removeSeeds();

    }
}
