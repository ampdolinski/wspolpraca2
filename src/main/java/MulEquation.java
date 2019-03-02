/**
 * @author Jacek Herrmann
 * Date: 2019-03-02
 */
public class MulEquation implements ICAlculable {
    private double num1;
    private double num2;

    public MulEquation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calculate(){
        return num1 * num2;
    }
}
