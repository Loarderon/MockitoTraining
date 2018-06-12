
/**
 * Class should receive input message from user
 */
public class FileReader {
    private Scanner scanner;

    public FileReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readNextLine() {
        return scanner.nextLine();
    }
}
