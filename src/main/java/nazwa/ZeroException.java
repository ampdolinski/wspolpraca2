package nazwa;

/**
 * @author Jacek Herrmann
 * Date: 2019-03-02
 */
public class ZeroException extends RuntimeException {
    public ZeroException() {
        super("Nie dzieli się przez zero!");
    }
}
