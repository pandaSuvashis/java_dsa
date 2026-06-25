import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class Queue_javaY {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // offer() - Add elements
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println("Queue: " + q);

        // peek() - View front element
        System.out.println("Front Element: " + q.peek());

        // poll() - Remove front element
        System.out.println("Removed: " + q.poll());

        System.out.println("After poll(): " + q);

        // size()
        System.out.println("Size: " + q.size());

        // contains()
        System.out.println("Contains 30? " + q.contains(30));

        // isEmpty()
        System.out.println("Is Empty? " + q.isEmpty());

        // Iterator
        System.out.print("Using Iterator: ");

        Iterator<Integer> it = q.iterator();

        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // For-Each Loop
        System.out.print("Using For-Each: ");

        for(Integer x : q){
            System.out.print(x + " ");
        }

        System.out.println();

        // Remove specific element
        q.remove(40);

        System.out.println("After removing 40: " + q);

        // Clear queue
        q.clear();

        System.out.println("After clear(): " + q);

        System.out.println("Is Empty? " + q.isEmpty());
    }
}