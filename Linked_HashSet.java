package package1;

import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ages = new LinkedHashSet<Integer>();
        ages.add(8);
        ages.add(1);
        ages.add(5);
        ages.add(7);
        ages.add(11);
        ages.add(null);
        ages.add(6);
        
        System.out.println(ages);
        

	}

}
