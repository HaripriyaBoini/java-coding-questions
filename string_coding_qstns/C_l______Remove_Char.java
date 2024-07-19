package string_coding_qstns;

import java.util.Scanner;

public class C_l______Remove_Char {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	
	String str=sc.nextLine();
	
	System.out.println("enter a character to remove");
	char charToRemove=sc.nextLine().charAt(2);
	
	sc.close();
	String result=removeChar(str,charToRemove);
	System.out.println("resulting String"+result);
	
	
		
	}
	
	public static String removeChar(String str,char charToRemove) {
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char currentchar=str.charAt(i);
			if(currentchar!=charToRemove) {
				sb.append(currentchar);
			}
		}
		
		return sb.toString();
		
		
	}
}

