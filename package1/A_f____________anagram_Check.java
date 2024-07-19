package package1;

import java.util.Arrays;

public class A_f____________anagram_Check {
	static boolean anagramCheck(String str1,String str2) {
		
		char[] charArray_from_str1=str1.toCharArray();
		char[] charArray_from_str2=str2.toCharArray();
		
		
		Arrays.sort(charArray_from_str1);
		Arrays.sort(charArray_from_str2);
		
		return Arrays.equals(charArray_from_str1,charArray_from_str1);
		
	}

	public static void main(String[] args) {
		String str1="java";
		String str2="avaj";
		System.out.println("Both Strings are anagrams"
		+anagramCheck(str1,str2));
		

	}

}
