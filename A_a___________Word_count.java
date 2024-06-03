package package1;

import java.util.Scanner;

public class A_a___________Word_count {
	
	static int wordcount(String str) {
		int count=0;
		char[] ch= new char[str.length()]; 
		for(int i=0;i<str.length();i++) {
			
			ch[i]=str.charAt(i);
			
			 if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) ) 
				count++;
			
		}return count;
	}
		
	
	public static void main(String[] args) { 
		
		Scanner sc =new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		System.out.println("No of words are:"
		+wordcount(str));
				
	}
		
	}
	
	
	

