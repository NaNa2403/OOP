package lab9.part2;

import java.util.*;

public class Sets {

    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (int value : first) {
            if (second.contains(value)) {
                intersection.add(value);
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>();
        for (int value : first) {
            union.add(value);
        }
        for (int value : second) {
            union.add(value);
        }
        return union;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return List.copyOf(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new LinkedHashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer item : list) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                return String.valueOf(c);
            }
            seen.add(c);
        }
        return null;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> seen = new HashSet<>();
        Set<Character> recurring = new LinkedHashSet<>();
        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                recurring.add(c);
            } else {
                seen.add(c);
            }
        }
        return recurring;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[source.size()]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        Integer result = source.higher(value);
        return result == null ? -1 : result;
    }

}
