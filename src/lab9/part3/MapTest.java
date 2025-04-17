package lab9.part3;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, Integer> testMap = new HashMap<>();
        testMap.put(1, 10);
        testMap.put(2, 20);
        testMap.put(3, 30);

        System.out.println("=== count ===");
        System.out.println(Maps.count(testMap)); // 3

        System.out.println("=== empty ===");
        Maps.empty(testMap);
        System.out.println(testMap); // Expected: {}

        testMap.put(1, 10);
        testMap.put(2, 20);
        testMap.put(3, 30);

        System.out.println("=== contains ===");
        System.out.println(Maps.contains(testMap, 1)); // true
        System.out.println(Maps.contains(testMap, 4)); // false

        System.out.println("=== containsKeyValue ===");
        System.out.println(Maps.containsKeyValue(testMap, 1, 10)); // true
        System.out.println(Maps.containsKeyValue(testMap, 2, 30)); // false

        System.out.println("=== keySet ===");
        System.out.println(Maps.keySet(testMap)); // [1, 2, 3]

        System.out.println("=== values ===");
        System.out.println(Maps.values(testMap)); // [10, 20, 30]

        System.out.println("=== getColor ===");
        System.out.println(Maps.getColor(0)); // black
        System.out.println(Maps.getColor(1)); // white
        System.out.println(Maps.getColor(2)); // red
        System.out.println(Maps.getColor(3)); // unknown
    }
}