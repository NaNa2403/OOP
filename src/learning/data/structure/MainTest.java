package learning.data.structure;

public class MainTest {
    public static void main(String[] args) {
        MyArrayQueue queue = new MyArrayQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // 10
        System.out.println(queue.peek());    // 20
        System.out.println(queue.isEmpty()); // false
    }
}
