package learning.data.structure.stack;

public class MyArrayList {
    int MAX_SIZE = 10000;
    int DEFAULT_CAPACITY;
    int [] elements;
    int numElements;

    public MyArrayList() {
        DEFAULT_CAPACITY = 10;
        elements = new int[MAX_SIZE];
        numElements = 0;
    }

    public MyArrayList(int capacity) {
        DEFAULT_CAPACITY = capacity;
        elements = new int[capacity];
        numElements = 0;
    }
}
