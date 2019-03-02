public class SumEquation implements ICAlculable {
    private double x;
    private double y;

    public SumEquation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculate() {
        return (x + y);
    }
}