package lab13.observer;

// Concrete Observers
class LoggingListener implements EventListener {
    private String log;

    public LoggingListener(String log) {
        this.log = log;
    }

    public void update(String eventType, String filename) {
        System.out.println("[Logging] " + eventType + " -> " + filename + " | log to: " + log);
    }
}
