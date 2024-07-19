package string_coding_qstns;

import java.util.HashMap;
import java.util.Map;

public class c_w______Display_duplicate_character_count {

	public static void main(String[] args) {
		String str="haripriyaa";
		

	 		Map<Character,Integer> charCountmap=new HashMap<>();
		char[] charArray=str.toCharArray();
		for(char c:charArray) {
			if(!charCountmap.containsKey(c)) {
				
				charCountmap.put(c,charCountmap.get(c)+1);
//				System.out.println(charCountmap.get(c));
				}
			else {
				charCountmap.put(c, 1);
			}
		}
			
			
			System.out.println("duplicate characters and its count");
		
			for(Map.Entry<Character,Integer> entry:charCountmap.entrySet()) {
				if(entry.getValue()>1) {
					System.out.println(entry.getKey()+"   : "+entry.getValue());
				}
			}
		}
		
	}


