package chapter9;

public class FinalExerciseBirthdayCake extends FinalExerciseCake{

    private int candles;

    public FinalExerciseBirthdayCake() {
        super("Vanilla");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
