package lab13.observer;

class EmailAlertsListener implements EventListener {
    private String email;

    public EmailAlertsListener(String email) {
        this.email = email;
    }

    public void update(String eventType, String filename) {
        System.out.println("[Email] " + eventType + " -> " + filename + " | sent to: " + email);
    }
}
