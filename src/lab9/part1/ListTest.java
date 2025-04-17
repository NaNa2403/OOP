package lab9.part1;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {
        System.out.println("=== insertFirst ===");
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        Lists.insertFirst(list1, 4);
        System.out.println(list1); // [1, 2, 3, 4]

        System.out.println("=== insertLast ===");
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
        Lists.insertLast(list2, 4);
        System.out.println(list2); // [1, 2, 3, 4]

        System.out.println("=== replace ===");
        List<Integer> list3 = new ArrayList<>(List.of(0, 1, 2, 3, 4));
        Lists.replace(list3, 99);
        System.out.println(list3); // [0, 1, 2, 99, 4]

        System.out.println("=== removeThird ===");
        List<Integer> list4 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Lists.removeThird(list4);
        System.out.println(list4); // [1, 2, 4, 5]

        System.out.println("=== removeEvil ===");
        List<Integer> list5 = new ArrayList<>(List.of(666, 1, 666, 2, 3, 666));
        Lists.removeEvil(list5);
        System.out.println(list5); // [1, 2, 3]

        System.out.println("=== generateSquare ===");
        List<Integer> squares = Lists.generateSquare();
        System.out.println(squares); // [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]

        System.out.println("=== contains ===");
        List<Integer> list6 = List.of(1, 2, 3, 4, 5);
        System.out.println(Lists.contains(list6, 3)); // true
        System.out.println(Lists.contains(list6, 7)); // false

        System.out.println("=== copy ===");
        List<Integer> source = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> target = new ArrayList<>(List.of(9, 9));
        Lists.copy(source, target);
        System.out.println("Source: " + source); // [1, 2, 3]
        System.out.println("Target: " + target); // [1, 2, 3]

        System.out.println("=== reverse ===");
        List<Integer> list7 = new ArrayList<>(List.of(1, 2, 3));
        Lists.reverse(list7);
        System.out.println(list7); // [3, 2, 1]

        System.out.println("=== reverseManual ===");
        List<Integer> list8 = new ArrayList<>(List.of(1, 2, 3));
        Lists.reverseManual(list8);
        System.out.println(list8); // [3, 2, 1]

        System.out.println("=== insertBegginningEnd ===");
        LinkedList<Integer> list9 = new LinkedList<>(List.of(2, 3, 4));
        Lists.insertBegginningEnd(list9, 1);
        System.out.println(list9); // [1, 2, 3, 4, 1]
    }
}
