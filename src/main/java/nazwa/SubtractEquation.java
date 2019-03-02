package nazwa;

public class SubtractEquation implements ICalculable {
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