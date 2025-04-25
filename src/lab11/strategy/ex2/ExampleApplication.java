package lab11.strategy.ex2;

import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Choose operation: +, -, *");
        String action = scanner.next();

        Context context = new Context(null);

        switch (action) {
            case "+":
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case "-":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "*":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            default:
                System.out.println("Unsupported operation.");
                return;
        }

        int result = context.executeStrategy(a, b);
        System.out.println("Result: " + result);
    }
}
