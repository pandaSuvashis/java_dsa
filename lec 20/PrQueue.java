import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.Collections;

public class PrQueue {

    public static void main(String[] args) {

        System.out.println("===== PRIORITY QUEUE =====");

        // Min Heap (Default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add()
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(40);

        System.out.println("Priority Queue: " + pq);

        // offer()
        pq.offer(60);
        System.out.println("After offer(60): " + pq);

        // peek()
        System.out.println("Peek Element: " + pq.peek());

        // poll()
        System.out.println("Poll Element: " + pq.poll());

        System.out.println("After poll(): " + pq);

        // contains()
        System.out.println("Contains 40? " + pq.contains(40));

        // size()
        System.out.println("Size: " + pq.size());

        // isEmpty()
        System.out.println("Is Empty? " + pq.isEmpty());

        // Iterator
        System.out.print("Using Iterator: ");

        Iterator<Integer> it = pq.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Remove specific element
        pq.remove(40);

        System.out.println("After remove(40): " + pq);

        // toArray()
        Object[] arr = pq.toArray();

        System.out.print("Array Elements: ");

        for(Object x : arr){
            System.out.print(x + " ");
        }

        System.out.println();

        // Clear
        PriorityQueue<Integer> copy =
                new PriorityQueue<>(pq);

        System.out.println("Copied Queue: " + copy);

        System.out.println("\nElements in Sorted Order:");

        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }

        System.out.println();

        // =============================
        // MAX HEAP
        // =============================

        System.out.println("\n===== MAX PRIORITY QUEUE =====");

        PriorityQueue<Integer> maxPQ =
                new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(50);
        maxPQ.add(10);
        maxPQ.add(30);
        maxPQ.add(20);
        maxPQ.add(40);

        System.out.println("Max Heap: " + maxPQ);

        System.out.println("Peek: " + maxPQ.peek());

        System.out.println("Poll: " + maxPQ.poll());

        System.out.println("After Poll: " + maxPQ);

        System.out.println("Elements in Descending Order:");

        while(!maxPQ.isEmpty()){
            System.out.print(maxPQ.poll() + " ");
        }
    }
}