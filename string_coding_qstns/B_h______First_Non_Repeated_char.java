package string_coding_qstns;

import java.util.HashSet;
import java.util.Set;

public class B_h______First_Non_Repeated_char {

	public static void main(String[] args) {
		String st="haripriya";
		System.out.println("remove duplicate letters and the string is ");
		StringBuilder sb=new StringBuilder();
		Set<Character> chh=new HashSet<>();
		
		for(char ch:st.toCharArray())
		{
			if(!chh.contains(ch)) {
				chh.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());

	}

}
