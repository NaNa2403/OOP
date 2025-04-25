package lab11.strategy.ex4;

public class NoDiscountStrategy implements PricingStrategy {
    @Override
    public double getFinalPrice(double basePrice) {
        return basePrice;
    }
}
