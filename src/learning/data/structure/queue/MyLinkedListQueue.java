package learning.data.structure;

import lab10.part2.ex1.MyLinkedListNode;

public class MyLinkedListQueue implements MyQueue {

    // Node định nghĩa bên ngoài hoặc bạn tự định nghĩa class Node
    private Node head;
    private Node tail;

    public MyLinkedListQueue() {
        head = null;
        tail = null;
    }

    @Override
    public void enqueue(int i) {
        MyLinkedListNode newNode = new MyLinkedListNode(i); // Tạo node mới
        if (isEmpty()) {
            head = tail = new Node(i);
        } else {
            tail.setNext(new Node(i));
            tail = tail.getNext();
        }
    }

    @Override
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        int value = head.getData();
        head = head.getNext();
        if (head == null) {
            tail = null;
        }
        return value;
    }

    @Override
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }
        return head.getData();
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
