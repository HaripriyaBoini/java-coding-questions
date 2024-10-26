package string_coding_qstns;

import java.util.Arrays;

public class B_g______Check_anagrams {

	public static void main(String[] args) {
		String str1="javac";
		String str2="cavajv";
		
		char[] ch1=str1.toCharArray();
		char[] ch2=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
	if(Arrays.equals(ch1, ch2)) {
		
		System.out.println("both statements are equal");
	}else {
		System.out.println("both statements are not equal");
	}
		
		
		

	}

}
