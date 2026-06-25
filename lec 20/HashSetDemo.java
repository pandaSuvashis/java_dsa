import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> set = new HashSet<>();

        // ==========================
        // add()
        // ==========================
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("HashSet: " + set);

        // Duplicate values are ignored
        set.add(20);
        System.out.println("After adding duplicate 20: " + set);

        // ==========================
        // size()
        // ==========================
        System.out.println("Size: " + set.size());

        // ==========================
        // contains()
        // ==========================
        System.out.println("Contains 30? " + set.contains(30));
        System.out.println("Contains 100? " + set.contains(100));

        // ==========================
        // remove()
        // ==========================
        set.remove(40);
        System.out.println("After removing 40: " + set);

        // ==========================
        // isEmpty()
        // ==========================
        System.out.println("Is Empty? " + set.isEmpty());

        // ==========================
        // Iteration using for-each
        // ==========================
        System.out.println("\nUsing For-Each Loop:");
        for (Integer num : set) {
            System.out.print(num + " ");
        }

        // ==========================
        // Iteration using Iterator
        // ==========================
        System.out.println("\n\nUsing Iterator:");

        Iterator<Integer> itr = set.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        // ==========================
        // clone()
        // ==========================
        HashSet<Integer> cloneSet =
                (HashSet<Integer>) set.clone();

        System.out.println("\n\nCloned Set: " + cloneSet);

        // ==========================
        // addAll()
        // ==========================
        HashSet<Integer> set2 = new HashSet<>();

        set2.add(60);
        set2.add(70);

        set.addAll(set2);

        System.out.println("After addAll(): " + set);

        // ==========================
        // removeAll()
        // ==========================
        set.removeAll(set2);

        System.out.println("After removeAll(): " + set);

        // ==========================
        // retainAll()
        // ==========================
        HashSet<Integer> set3 = new HashSet<>();

        set3.add(10);
        set3.add(20);

        set.retainAll(set3);

        System.out.println("After retainAll(): " + set);

        // ==========================
        // clear()
        // ==========================
        set.clear();

        System.out.println("After clear(): " + set);

        // ==========================
        // isEmpty()
        // ==========================
        System.out.println("Is Empty Now? " + set.isEmpty());
    }
}