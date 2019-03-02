/**
 * @author Jacek Herrmann
 * Date: 2019-03-02
 */
public class PowEquation {
    private double n;
    private double pow;

    public PowEquation(double n, double pow) {
        this.n = n;
        this.pow = pow;
    }

    public double getPow() {
        return Math.pow(n, pow);
    }
}
