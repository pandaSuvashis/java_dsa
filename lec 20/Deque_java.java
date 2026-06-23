import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque_java {

    public static void main(String[] args) {

        System.out.println("===== DEQUE IN JAVA =====");

        // Creating Deque
        Deque<Integer> dq = new ArrayDeque<>();

        // addFirst()
        dq.addFirst(20);
        dq.addFirst(10);

        // addLast()
        dq.addLast(30);
        dq.addLast(40);

        System.out.println("Deque: " + dq);

        // offerFirst()
        dq.offerFirst(5);

        // offerLast()
        dq.offerLast(50);

        System.out.println("After offer operations: " + dq);

        // getFirst()
        System.out.println("First Element: " + dq.getFirst());

        // getLast()
        System.out.println("Last Element: " + dq.getLast());

        // peekFirst()
        System.out.println("Peek First: " + dq.peekFirst());

        // peekLast()
        System.out.println("Peek Last: " + dq.peekLast());

        // removeFirst()
        System.out.println("Removed First: " + dq.removeFirst());

        // removeLast()
        System.out.println("Removed Last: " + dq.removeLast());

        System.out.println("After remove operations: " + dq);

        // pollFirst()
        System.out.println("Poll First: " + dq.pollFirst());

        // pollLast()
        System.out.println("Poll Last: " + dq.pollLast());

        System.out.println("After poll operations: " + dq);

        // add elements again
        dq.addFirst(100);
        dq.addLast(200);
        dq.addLast(300);

        System.out.println("Updated Deque: " + dq);

        // contains()
        System.out.println("Contains 200? " + dq.contains(200));

        // size()
        System.out.println("Size: " + dq.size());

        // Iterator
        System.out.print("Using Iterator: ");

        Iterator<Integer> it = dq.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // Enhanced For Loop
        System.out.print("Using For-Each: ");

        for (Integer x : dq) {
            System.out.print(x + " ");
        }

        System.out.println();

        // Using Deque as Stack
        System.out.println("\n===== DEQUE AS STACK =====");

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("Pop: " + stack.pop());

        System.out.println("Peek: " + stack.peek());

        // Using Deque as Queue
        System.out.println("\n===== DEQUE AS QUEUE =====");

        Deque<Integer> queue = new ArrayDeque<>();

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);

        System.out.println("Poll: " + queue.poll());

        System.out.println("Peek: " + queue.peek());

        // clear()
        dq.clear();

        System.out.println("\nAfter clear(): " + dq);

        // isEmpty()
        System.out.println("Is Empty? " + dq.isEmpty());
    }
}