package lab11.strategy.ex4;

public class MembershipDiscountStrategy implements PricingStrategy {
    private boolean isPremium;

    public MembershipDiscountStrategy(boolean isPremium) {
        this.isPremium = isPremium;
    }

    @Override
    public double getFinalPrice(double basePrice) {
        return isPremium ? basePrice * 0.8 : basePrice * 0.95;
    }
}
