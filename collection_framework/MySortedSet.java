package collection_framework;

import java.util.SortedSet;
import java.util.TreeSet;
public class MySortedSet {


	
	    public static void main(String[] args) {
	        // Creating a SortedSet using TreeSet
	        SortedSet<String> sortedSet = new TreeSet<>();

	        // Adding elements to the SortedSet
	        sortedSet.add("Apple");
	        sortedSet.add("Banana");
	        sortedSet.add("Orange");
	        sortedSet.add("Grapes");
	        sortedSet.add("Mango");

	        // Printing the SortedSet
	        System.out.println("SortedSet: " + sortedSet);

	        // Accessing the first and last elements
	        System.out.println("First element: " + sortedSet.first());
	        System.out.println("Last element: " + sortedSet.last());
	        
	        System.out.println("remove first: " + sortedSet.removeFirst());
	        System.out.println("remove last: " + sortedSet.removeLast());

	        // Creating a subset of elements
	       SortedSet<String> subset = sortedSet.subSet("Banana", "Grapes");
	        System.out.println("Subset: " + subset);
	    }
	}


