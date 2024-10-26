package collection_framework;

import java.util.SortedMap;
import java.util.TreeMap;

public class Sorted_and_Treemap {

	public static void main(String[] args) {
		
        SortedMap<Integer, String> sortedMap = new TreeMap<>();
        //or 
        //  TreeMap<Integer, String> sortedMap = new TreeMap<>();

        // Adding key-value pairs to the map
        sortedMap.put(1, "Apple");
        sortedMap.put(3, "Banana");
        sortedMap.put(2, "Orange");                 //put()
        sortedMap.put(5, "Grapes");
         sortedMap.put(4, "Mango");

        // Printing the SortedMap
        System.out.println("SortedMap: " + sortedMap);

        // Accessing the first and last keys
        System.out.println("First key: " + sortedMap.firstKey());     //firstKey()
        System.out.println("Last key: " + sortedMap.lastKey());        //lastKey()


        SortedMap<Integer, String> subMap = sortedMap.subMap(2, 4);   //submap(2,4)
        System.out.println("Submap: " + subMap);

        SortedMap<Integer, String> headMap = sortedMap.headMap(3); // keys less than 3
        System.out.println("Headmap: " + headMap);                    //headMap(3)---->less than 3

         
        SortedMap<Integer, String> tailMap = sortedMap.tailMap(3); // keys greater than or equal to 3
        System.out.println("Tailmap: " + tailMap);         //tailMap(keynumber)
	}

}
