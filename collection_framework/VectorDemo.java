package collection_framework;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

	

		
		  
		        // Create a Vector
		        Vector<String> vector = new Vector<>();

		        // Add elements to the Vector
		        vector.add("apple");
		        vector.add("banana");
		        vector.add("orange");

		        // Access elements using index
		        System.out.println("Element at index 1: " + vector.elementAt(1));

		        // Remove an element
		        vector.removeElement("banana");

		        // Iterate over the elements
		        System.out.println("Elements:");
		        for (String element : vector) {
		            System.out.println(element);
		        }
		    }
		

	}


