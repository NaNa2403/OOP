package lab11.singleton.ex2;

public class Application {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)");
        System.out.println("If you see different instances, then multiple singletons were created (booo!!)");
        System.out.println("RESULT:\n");

        Database foo = Database.getInstance();
        foo.query("SELECT * FROM users");

        Database bar = Database.getInstance();
        bar.query("SELECT * FROM orders");

        // Checking if foo and bar are the same instance
        System.out.println("Are foo and bar the same instance? " + (foo == bar));
    }
}
