package package1;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		 // Creating a NavigableSet using TreeSet
        NavigableSet<Integer> navigableSet = new TreeSet<>();

        // Adding elements to the NavigableSet
        navigableSet.add(10);
        navigableSet.add(30);
        navigableSet.add(20);
        navigableSet.add(50);
        navigableSet.add(40);

        // Printing the NavigableSet
        System.out.println("NavigableSet: " + navigableSet);

        // Using navigation methods
        System.out.println("Lower than 30: " + navigableSet.lower(30));
        System.out.println("Floor of 30: " + navigableSet.floor(30));
        System.out.println("Ceiling of 30: " + navigableSet.ceiling(30));
        System.out.println("Higher than 30: " + navigableSet.higher(30));

        // Removing the first and last elements
        System.out.println("Removing first element: " + navigableSet.pollFirst());
        System.out.println("Removing last element: " + navigableSet.pollLast());

        // Printing the NavigableSet after removal
        System.out.println("NavigableSet after removal: " + navigableSet);

        // Descending set and iterator
        System.out.println("Descending set: " + navigableSet.descendingSet());
        System.out.print("Descending order using iterator: ");
	}

}
