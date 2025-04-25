package lab11.strategy.ex1;

import lab11.strategy.ex1.order.*;
import lab11.strategy.ex1.strategies.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class App {
    private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static PayStrategy strategy;
    private static Order order = Order.getInstance();  // Singleton

    static {
        priceOnProducts.put(1, 2200); // Motherboard
        priceOnProducts.put(2, 1850); // CPU
        priceOnProducts.put(3, 1100); // HDD
        priceOnProducts.put(4, 890);  // Memory
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;

            do {
                System.out.print("Please, select a product:\n1 - Motherboard\n2 - CPU\n3 - HDD\n4 - Memory\nChoice: ");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);

                System.out.print("Count: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);

                System.out.print("Do you wish to continue selecting products? Y/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));

            if (strategy == null) {
                System.out.println("Please, select a payment method:\n1 - PayPal\n2 - Credit Card");
                String paymentMethod = reader.readLine();

                if (paymentMethod.equals("1")) {
                    strategy = new PayByPaypal();
                } else {
                    strategy = new PayByCreditCard();
                }

                order.processOrder(strategy);
            }

            System.out.print("Pay " + order.getTotalCost() + " units or Continue shopping? P/C: ");
            String proceed = reader.readLine();

            if (proceed.equalsIgnoreCase("P")) {
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
    }
}
