import java.io.PrintStream;

/**
 * Class should print input message
 */
public class ConsoleWriter {
    private PrintStream out;

    public ConsoleWriter(PrintStream out) {
        this.out = out;
    }

    public void print(String message) {
        out.println(message);
    }
}
