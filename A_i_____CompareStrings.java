package package1;

import java.util.Scanner;

public class A_i_____CompareStrings {  

	public static void main(String[] args) {
		String s1,s2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first string");
		s1=sc.nextLine();
				
				System.out.println("enter the second string");
		s2=sc.nextLine();
		
		
		int result=s1.compareTo(s2);
	
		if(result>0)
		
		{
			System.out.println("first string is reater than s2");
		}
		else if(result<0) {
			System.out.println(result);
			System.out.println("First string is lesser");
		}
		else
			System.out.println("both are equal");
		}
	}


