package package1;

import java.util.TreeSet;
public class SortedSet {


	
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
	        System.out.println("Last element: " + sortedSet.higher());

	        // Creating a subset of elements
	        SortedSet<String> subset = sortedSet.subSet("Banana", "Grapes");
	        System.out.println("Subset: " + subset);
	    }
	}

}
