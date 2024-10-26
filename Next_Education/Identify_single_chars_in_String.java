package Next_Education;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Identify_single_chars_in_String {

	public static void main(String[] args) {
		String str= "aaggef";
		int count=1;
		Map<Character,Integer> countmap=new LinkedHashMap<>();
           for(char ch:str.toCharArray()) {
        	   countmap.put(ch, countmap.containsKey(ch)?++count:1);
           }
           for(Entry<Character,Integer> entry:countmap.entrySet()) {
        	         if(entry.getValue()==1) {
        	        	 System.out.println(entry.getKey());
        	         }
           }
	}

} 