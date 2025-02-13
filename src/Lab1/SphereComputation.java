package Lab1;

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        double radius;
        double surfaceArea;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius ");
        radius = scanner.nextDouble();

        surfaceArea = 4.0 * Math.PI * radius * radius;
        volume = 4.0/3.0 * Math.PI * radius * radius * radius;

        System.out.printf("Surface Area is : %.2f%n", surfaceArea);
        System.out.printf("Volume is : %.2f%n", volume);

    }
}
