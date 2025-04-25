package lab11.strategy.ex4;

public class Product {
    private String name;
    private double basePrice;
    private PricingStrategy pricingStrategy;

    public Product(String name, double basePrice, PricingStrategy pricingStrategy) {
        this.name = name;
        this.basePrice = basePrice;
        this.pricingStrategy = pricingStrategy;
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void displayFinalPrice() {
        double finalPrice = pricingStrategy.getFinalPrice(basePrice);
        System.out.println("Product: " + name + " | Final Price: $" + String.format("%.2f", finalPrice));
    }
}
