package lab11.strategy.ex1.order;

import lab11.strategy.ex1.strategies.PayStrategy;

public class Order {
    private static Order instance;
    private int totalCost = 0;
    private boolean isClosed = false;

    private Order() {}

    public static Order getInstance() {
        if (instance == null) {
            instance = new Order();
        }
        return instance;
    }

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}
