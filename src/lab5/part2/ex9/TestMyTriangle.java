package lab5.part2.ex9;

public class TestMyTriangle {
    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 3, 4);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(0, 0), new MyPoint(4, 0), new MyPoint(2, 4));
        MyTriangle triangle3 = new MyTriangle(0, 0, 2, 2, 4, 0);

        System.out.println("Triangle 1: " + triangle1);
        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());
        System.out.println("Type of Triangle 1: " + triangle1.getType());

        System.out.println("Triangle 2: " + triangle2);
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());
        System.out.println("Type of Triangle 2: " + triangle2.getType());

        System.out.println("Triangle 3: " + triangle3);
        System.out.println("Perimeter of Triangle 3: " + triangle3.getPerimeter());
        System.out.println("Type of Triangle 3: " + triangle3.getType());
    }
}
