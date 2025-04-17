package lab10.part2.ex1;

public abstract class MyAbstractList implements MyList {
    public MyAbstractList() {
    }

    public void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < this.size(); i++) {
            str.append(String.format("[%s] ", get(i).toString()));
        }
        return str.toString();
    }
}
