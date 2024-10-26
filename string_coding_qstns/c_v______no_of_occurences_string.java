package string_coding_qstns;

import java.util.HashMap;
import java.util.Map;

public class c_v______no_of_occurences_string {

	public static void main(String[] args) {
		String s="haripriyaa";
		Map<Character,Integer> charCountMap=new HashMap<>();
		char[] charArray=s.toCharArray();
		
		for(char c:charArray) {
			if(charCountMap.containsKey(c)) {
				
				charCountMap.put(c,charCountMap.get(c)+1);
			}else {
				charCountMap.put(c,1);
			}
		}
		System.out.println("character counts");
		for(Map.Entry<Character,Integer> entry:charCountMap.entrySet()) {
			System.out.println(entry.getKey()+"   : "+entry.getValue());
		}

	}

}
