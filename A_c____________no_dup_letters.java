package package1;

import java.util.HashSet;
import java.util.Set;

public class A_c____________no_dup_letters {
	
	static String noDuplicate(String str) {
	Set<Character> hashset=new HashSet<>();
	StringBuffer sb =new StringBuffer();
	
	for(int i=0;i<str.length();i++) {
		
		char s=str.charAt(i);
		if(!hashset.contains(s)) {
			hashset.add(s);
			sb.append(s);
		}
	}return sb.toString();		
	}
	
	public static void main(String[] args) {
		String str="sandeep";
		System.out.println("word without duplicates is :  "+noDuplicate(str));

		
	}
		
}
