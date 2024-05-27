import java.util.LinkedList;
import java.util.Queue;

public class Queue {
    public static void main(String[] args) {
    	Queue<String> queue = new LinkedList<>();

        // Adding elements to the Queue
        queue.add("First");
        queue.offer("Second");
        queue.add("Third");

        // Retrieving and removing elements from the Queue
        String removedElement1 = queue.remove();
        System.out.println("Removed Element: " + removedElement1);

        String removedElement2 = queue.poll();
        System.out.println("Removed Element: " + removedElement2);

        // Retrieving the head of the Queue without removing it
        String peekedElement = queue.element();
        System.out.println("Peeked Element: " + peekedElement);

        String peekedElementAgain = queue.peek();
        System.out.println("Peeked Element: " + peekedElementAgain);
    }
}
