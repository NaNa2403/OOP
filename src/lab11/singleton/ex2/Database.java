package lab11.singleton.ex2;

public class Database {
    // Static field for storing singleton instance
    private static Database instance;

    // Private constructor to prevent external instantiation
    private Database() {
        System.out.println("Connecting to the database...");
        // Simulate actual connection setup
    }

    // Static method to provide access to the singleton instance
    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    // Example business logic method
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
        // Simulate database query execution
    }
}
