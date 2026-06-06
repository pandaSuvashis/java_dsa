import java.util.LinkedList;

public class Qeueueueu {
    public static void main(String[] args) {
        // Queue Operations
        System.out.println("\n===== LINKEDLIST AS QUEUE =====");

        LinkedList<Integer> queue = new LinkedList<>();

        queue.offer(100);
        queue.offer(200);
        queue.offer(300);

        System.out.println("Queue: " + queue);

        System.out.println("poll(): " + queue.poll());

        System.out.println("Queue After poll(): " + queue);

        System.out.println("peek(): " + queue.peek());

        // Stack Operations
        System.out.println("\n===== LINKEDLIST AS STACK =====");

        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        System.out.println("pop(): " + stack.pop());

        System.out.println("After pop(): " + stack);

        System.out.println("peek(): " + stack.peek());

        // clear()
        queue.clear();

        System.out.println("\nAfter clear(): " + queue);

        // isEmpty()
        System.out.println("Is Empty? " + queue.isEmpty());
    
    }
}
