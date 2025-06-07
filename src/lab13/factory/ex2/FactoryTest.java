package lab13.factory.ex2;

public class FactoryTest {
    public static void main(String[] args) {
        Notification n1 = NotificationFactory.createNotification("email");
        n1.notifyUser();

        Notification n2 = NotificationFactory.createNotification("sms");
        n2.notifyUser();

        Notification n3 = NotificationFactory.createNotification("push");
        n3.notifyUser();
    }
}
