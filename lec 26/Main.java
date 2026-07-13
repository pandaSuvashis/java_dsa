import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {

    static boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequencies
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print frequencies
        System.out.println("Element -> Occurrences");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Check if frequencies are unique
        HashSet<Integer> set = new HashSet<>();

        for (int freq : map.values()) {
            if (set.contains(freq)) {
                return false;
            }
            set.add(freq);
        }

        return true;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 1, 1, 3};

        boolean ans = uniqueOccurrences(arr);

        System.out.println("\nAre occurrences unique? " + ans);
    }
}