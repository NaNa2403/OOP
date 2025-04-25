package lab11.strategy.ex4;

import java.util.Scanner;

public class PricingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sản phẩm
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter base price: ");
        double price = scanner.nextDouble();

        // Chọn chiến lược định giá
        System.out.println("Choose pricing strategy:");
        System.out.println("1 - No Discount");
        System.out.println("2 - Percentage Discount");
        System.out.println("3 - Membership Discount");
        int choice = scanner.nextInt();

        PricingStrategy strategy = null;

        switch (choice) {
            case 1:
                strategy = new NoDiscountStrategy();
                break;
            case 2:
                System.out.print("Enter discount percentage: ");
                double percent = scanner.nextDouble();
                strategy = new PercentageDiscountStrategy(percent);
                break;
            case 3:
                System.out.print("Is customer premium? (true/false): ");
                boolean isPremium = scanner.nextBoolean();
                strategy = new MembershipDiscountStrategy(isPremium);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Tạo sản phẩm với chiến lược giá tương ứng
        Product product = new Product(name, price, strategy);
        product.displayFinalPrice();
    }
}
