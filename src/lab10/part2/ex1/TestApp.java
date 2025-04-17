package lab10.part2.ex1;

public class TestApp {
    public static void main(String[] args) {
        MyList l1 = new MyArrayList();
        l1.add("a", 0);
        l1.add("b");
        l1.add("c", 0);
        l1.add("c", 3);
        l1.remove(3);
        System.out.println(l1.size());
        System.out.println(l1);

        MyList l2 = new MyLinkedList();
        l2.add("a", 0);
        l2.add("b");
        l2.add("c", 0);
        l2.add("c", 3);
        l2.remove(3);
        System.out.println(l2.size());
        System.out.println(l2);
    }
}
