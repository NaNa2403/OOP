package lab13.observer;

// Main class
public class ObserverExample {
    public static void main(String[] args) {
        Editor editor = new Editor();

        LoggingListener logger = new LoggingListener("log.txt");
        EmailAlertsListener emailer = new EmailAlertsListener("admin@example.com");

        editor.events.subscribe("open", logger);
        editor.events.subscribe("save", emailer);

        editor.openFile("test.java");
        editor.saveFile();
    }
}
