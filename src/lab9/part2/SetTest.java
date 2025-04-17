package lab9.part2;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        System.out.println("=== intersectionManual ===");
        System.out.println(Sets.intersectionManual(Set.of(1, 2, 3), Set.of(2, 3, 4))); // [2, 3]

        System.out.println("=== unionManual ===");
        System.out.println(Sets.unionManual(Set.of(1, 2), Set.of(2, 3))); // [1, 2, 3]

        System.out.println("=== intersection ===");
        System.out.println(Sets.intersection(Set.of(1, 2, 3), Set.of(3, 4))); // [3]

        System.out.println("=== union ===");
        System.out.println(Sets.union(Set.of(1), Set.of(2, 3))); // [1, 2, 3]

        System.out.println("=== toList ===");
        Set<Integer> set = new HashSet<>(Set.of(10, 20, 30));
        List<Integer> list = Sets.toList(set);
        System.out.println(list); // [10, 20, 30] — order may vary

        System.out.println("=== removeDuplicates ===");
        List<Integer> withDupes = List.of(1, 2, 2, 3, 1, 4);
        System.out.println(Sets.removeDuplicates(withDupes)); // [1, 2, 3, 4]

        System.out.println("=== removeDuplicatesManual ===");
        System.out.println(Sets.removeDuplicatesManual(withDupes)); // [1, 2, 3, 4]

        System.out.println("=== firstRecurringCharacter ===");
        System.out.println(Sets.firstRecurringCharacter("abaco")); // a
        System.out.println(Sets.firstRecurringCharacter("xyz"));   // null

        System.out.println("=== allRecurringChars ===");
        System.out.println(Sets.allRecurringChars("mamma")); // [m, a]

        System.out.println("=== toArray ===");
        Integer[] array = Sets.toArray(new LinkedHashSet<>(List.of(10, 5, 15)));
        System.out.println(Arrays.toString(array)); // [5, 10, 15] — order may vary

        System.out.println("=== getFirst and getLast ===");
        TreeSet<Integer> tree = new TreeSet<>(List.of(5, 10, 15, 20));
        System.out.println("First: " + Sets.getFirst(tree)); // 5
        System.out.println("Last: " + Sets.getLast(tree));   // 20

        System.out.println("=== getGreater ===");
        System.out.println(Sets.getGreater(tree, 10)); // 20
        System.out.println(Sets.getGreater(tree, 20)); // -1
    }
}
