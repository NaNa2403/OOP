package lab10.part2.ex1;

public class MyArrayList extends MyAbstractList {
    static final int INTIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INTIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size >= elements.length - 1){
            enlarge();
        }
        elements[size] = o;
        size++;
    }

    @Override
    public void add(Object o, int index) {
        if (size >= elements.length - 1){
            enlarge();
        }
        Object[] tmp = new Object[elements.length];
        System.arraycopy(elements, 0, tmp, 0, index);
        tmp[index] = o;
        System.arraycopy(elements, index, tmp, index + 1, size - index);

        size++;
        elements = tmp;
    }


    @Override
    public Object get(int index) {
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        Object[] tmp = new Object[elements.length - 1];
        System.arraycopy(elements, 0, tmp, 0, index);
        System.arraycopy(elements, index + 1, tmp, index, size - index - 1);
        size--;
        elements = tmp;
    }

    void enlarge(){
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
