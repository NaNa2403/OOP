package lab11.singleton.ex3;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Verify both are the same instance
        System.out.println("Are both logger instances the same? " + (logger1 == logger2));
    }
}
