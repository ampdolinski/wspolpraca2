public class SubtractEquation implements ICAlculable {
    private double x;
    private double y;

    public SubtractEquation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double calculate() {
        return (x - y);
    }
}