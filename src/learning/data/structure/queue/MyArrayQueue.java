package learning.data.structure;

import java.util.Arrays;

public class MyArrayQueue implements MyQueue {
    public int MAX_SIZE;
    private static final int DEFAULT_CAPACITY = 10;  // Sức chứa mặc định
    private int[] elements;
    private int headIndex;
    private int tailIndex;
    private int numberOfElement;

    public MyArrayQueue() {
        elements = new int[DEFAULT_CAPACITY];
        headIndex = 0;
        tailIndex = 0;
        numberOfElement = 0;
    }

    @Override
    public void enqueue(int i) {
        if (numberOfElement >= elements.length) {
            grow();
        }
        elements[tailIndex] = i;
        tailIndex = tailIndex + 1;
        numberOfElement++;
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        int value = elements[headIndex];
        elements = Arrays.copyOfRange(elements, headIndex +1 , tailIndex);
        numberOfElement--;
        return value;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return elements[headIndex];
    }

    @Override
    public boolean isEmpty() {
        return numberOfElement == 0;
    }

    private void grow() {
        int newCapacity = elements.length * 2;
        int[] newElements = new int[newCapacity];

        for (int i = 0; i < numberOfElement; i++) {
            newElements[i] = elements[(headIndex + i) % elements.length];
        }

        elements = newElements;
        headIndex = 0;
        tailIndex = numberOfElement;
    }
}
