package string_coding_qstns;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class c_o______Find_Non_Repeated_Char {

	public static void main(String[] args) {
		
		String str="haripriya";
		char c=getFirstChar(str);
		System.out.println("Non repeated characters : "+c);
		
		
		

	}

	private static char getFirstChar(String str) {
		int count=1;
		
		Map<Character,Integer> countmap=new LinkedHashMap<>();
		for(char ch:str.toCharArray()) {
			
			countmap.put(ch,countmap.containsKey(ch)?count++:1);
			}
		for(Entry<Character,Integer> entry:countmap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
		}
		throw new RuntimeException("exception raised");
		  
			
			
			
		
	}

}
