package collection_framework;

import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		
		        // Create a LinkedList
		        LinkedList<String> linkedList = new LinkedList<>();

		        // 1. addFirst(E e)
		        linkedList.addFirst("apple");
		        
		        // 2. addLast(E e)
		        linkedList.addLast("banana");
		        
		        // 3. removeFirst()
		        String removedFirst = linkedList.removeFirst();
		        
		        // 4. removeLast()
		        String removedLast = linkedList.removeLast();
		        
		        // 5. getFirst()
		        linkedList.add("orange");
		        String firstElement = linkedList.getFirst();
		        
		        // 6. getLast()
		        linkedList.add("grape");
		        String lastElement = linkedList.getLast();
		        
		        // 7. offer(E e)
		        boolean inserted = linkedList.offer("kiwi");
		        
		        // 8. offerFirst(E e)
		        boolean insertedFirst = linkedList.offerFirst("watermelon");
		        
		        // 9. offerLast(E e)
		        boolean insertedLast = linkedList.offerLast("melon");
		        
		        // Print the elements and results
		        System.out.println("LinkedList: " + linkedList);
		        System.out.println("Removed first element: " + removedFirst);
		        System.out.println("Removed last element: " + removedLast);
		        System.out.println("First element: " + firstElement);
		        System.out.println("Last element: " + lastElement);
		        System.out.println("Element 'kiwi' inserted: " + inserted);
		        System.out.println("Element 'watermelon' inserted at first: " + insertedFirst);
		        System.out.println("Element 'melon' inserted at last: " + insertedLast);
		    }
		


	}


