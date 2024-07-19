package string_coding_qstns;

import java.util.Scanner;

public class c_p______COUNT_No_of_Vowels_2 {

	public static void main(String[] args) {
		
		System.out.println("enter some string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char[] chars=str.toCharArray();
		int count=0;
		
		for(char c:chars) {
			switch(c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
		System.out.println("No of vowels are"+count);
		
		
		

}
	
}
