import java.util.Iterator;
import java.util.Vector;
import java.util.Collections;

public class Vec {

    public static void main(String[] args) {

        System.out.println("===== VECTOR IN JAVA =====");

        // Creating Vector
        Vector<Integer> v = new Vector<>();

        // add()
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);

        System.out.println("Original Vector: " + v);

        // add at index
        v.add(2, 25);
        System.out.println("After add(2, 25): " + v);

        // get()
        System.out.println("Element at index 3: " + v.get(3));

        // set()
        System.out.println("Replaced Element: " + v.set(3, 100));
        System.out.println("After set(): " + v);

        // contains()
        System.out.println("Contains 100? " + v.contains(100));

        // size()
        System.out.println("Size: " + v.size());

        // capacity()
        System.out.println("Capacity: " + v.capacity());

        // firstElement()
        System.out.println("First Element: " + v.firstElement());

        // lastElement()
        System.out.println("Last Element: " + v.lastElement());

        // indexOf()
        System.out.println("Index of 100: " + v.indexOf(100));

        // lastIndexOf()
        v.add(100);
        System.out.println("After adding another 100: " + v);
        System.out.println("Last Index of 100: " + v.lastIndexOf(100));

        // remove(index)
        v.remove(2);
        System.out.println("After remove(2): " + v);

        // removeElement()
        v.removeElement(100);
        System.out.println("After removeElement(100): " + v);

        // Iterator
        System.out.print("Using Iterator: ");

        Iterator<Integer> it = v.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // For-Each Loop
        System.out.print("Using For-Each: ");

        for (Integer x : v) {
            System.out.print(x + " ");
        }

        System.out.println();

        // toArray()
        Object[] arr = v.toArray();

        System.out.print("Array Elements: ");

        for (Object x : arr) {
            System.out.print(x + " ");
        }

        System.out.println();

        // clone()
        Vector<Integer> copy = (Vector<Integer>) v.clone();

        System.out.println("Cloned Vector: " + copy);

        // Sorting
        Collections.sort(v);

        System.out.println("Sorted Vector: " + v);

        // ensureCapacity()
        v.ensureCapacity(50);

        System.out.println("Capacity after ensureCapacity(50): "
                + v.capacity());

        // isEmpty()
        System.out.println("Is Empty? " + v.isEmpty());

        // clear()
        v.clear();

        System.out.println("After clear(): " + v);

        System.out.println("Is Empty? " + v.isEmpty());
    }
}