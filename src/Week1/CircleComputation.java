package Week1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        double radius;
        double diameter;
        double circumference;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius ");
        radius = scanner.nextDouble();

        diameter = 2 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;

        System.out.printf("Diameter is : %.2f%n", diameter);
        System.out.printf("Circumference is : %.2f%n", circumference);
        System.out.printf("Area is : %.2f%n", area);
    }
}
