package Next_Education;

import java.util.HashSet;

public class Identify_numbers {

	public static void main(String[] args) {
		String str="Nexpro123";
		HashSet<Character> hash=new HashSet<>();
		int b=str.length()-1;
		for(int i=0;i<=b;i++) {
			char ch=str.charAt(i);
			if(!Character.isLetter(ch)) {
				hash.add(ch);
			}
		}
		System.out.println(hash);
	}

}
