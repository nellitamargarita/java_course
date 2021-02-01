package chapter9;

public class FinalExerciseCake {

    private String flavor;
    private int price;

    public FinalExerciseCake(){}
    public FinalExerciseCake(String flavor) {
       setFlavor(flavor);
       setPrice(9);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
