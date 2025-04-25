package lab11.strategy.ex4;

public class PercentageDiscountStrategy implements PricingStrategy {
    private double discountPercent;

    public PercentageDiscountStrategy(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double getFinalPrice(double basePrice) {
        return basePrice * (1 - discountPercent / 100);
    }
}
