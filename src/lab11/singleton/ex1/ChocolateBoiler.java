package lab11.singleton.ex1;

public class ChocolateBoiler {
    // Singleton instance
    private static ChocolateBoiler uniqueInstance;

    private boolean empty;
    private boolean boiled;

    // Private constructor to prevent instantiation
    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // Public method to provide global access point
    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
            System.out.println("Filling the boiler with milk and chocolate...");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            System.out.println("Draining the boiled milk and chocolate...");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            System.out.println("Boiling contents...");
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
