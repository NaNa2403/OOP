package lab11.adapter.ex1;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        // Chuyển đổi width của SquarePeg sang bán kính tương đương
        return (squarePeg.getWidth() * Math.sqrt(2)) / 2;
    }
}
