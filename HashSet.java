package package1;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		Set<String> batch1 = new LinkedHashSet<String>();
		batch1.add("abhi");
		batch1.add("ashutosh");
		batch1.add("megha");
		batch1.add("sohaib");
		batch1.add("chetan");                                        //add
		batch1.add(null);
		batch1.add(null);
		
		System.out.println(batch1);
		Set<String> batch2 = new LinkedHashSet<String>();
		batch2.addAll(batch1);                                  //addAll
		System.out.println(batch2.remove("ashutosh"));            //remove
		batch1.removeAll(batch2);
		if(batch1.contains("abhi"));                  //contain
		System.out.println("abhi is not there");
		System.out.println(batch2.isEmpty());         //isEmpty
		batch2.clear();                              //clear
		System.out.println(batch2);
		{
			
		}
		
		
		
		
		
	}

}
