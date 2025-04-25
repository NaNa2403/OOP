package lab11.adapter.ex1;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        System.out.println("Round peg fits? " + hole.fits(roundPeg)); // true

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        // Adapter cho phép square peg tương thích với round hole
        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSquarePeg);

        System.out.println("Small square peg fits? " + hole.fits(smallAdapter)); // true
        System.out.println("Large square peg fits? " + hole.fits(largeAdapter)); // false
    }
}
