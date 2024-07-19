package collection_framework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the PriorityQueue using add() or offer()
        pq.add(5);
        pq.offer(3);
        pq.add(8);
        pq.offer(1);

        // Printing the PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // Retrieving and removing the head of the PriorityQueue using poll() or remove()
        int removedElement1 = pq.poll();
        System.out.println("Removed Element: " + removedElement1);

        int removedElement2 = pq.remove();
        System.out.println("Removed Element: " + removedElement2);

        // Retrieving the head of the PriorityQueue without removing it using peek()
        int peekedElement = pq.peek();
        System.out.println("Peeked Element: " + peekedElement);

        // Checking if the PriorityQueue contains a specific element
        System.out.println("Contains 8: " + pq.contains(8));

        // Getting the size of the PriorityQueue
        System.out.println("Size of PriorityQueue: " + pq.size());

        // Removing all elements from the PriorityQueue using clear()
        pq.clear();
        System.out.println("PriorityQueue after clear(): " + pq);

        // Adding elements to the PriorityQueue using add() or offer()
        pq.add(10);
        pq.offer(20);
        pq.add(15);
        pq.offer(25);

        // Converting PriorityQueue to an array using toArray()
        Object[] array = pq.toArray();
        System.out.print("PriorityQueue elements as array: ");
        for (Object element : array) {
            System.out.print(element + " ");
        }
        System.out.println();

	}

}
