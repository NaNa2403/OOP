package lab11.singleton.ex3;

public class Logger {
    // Singleton instance
    private static Logger instance;

    // Private constructor
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Public method to get the singleton instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
