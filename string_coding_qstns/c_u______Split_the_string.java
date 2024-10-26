package string_coding_qstns;

import java.util.StringTokenizer;

public class c_u______Split_the_string {

	public static void main(String[] args) {
		String s="091-1234567-890";
		String[] str=s.split("-");
		printString(str,"Split method");
		

	}

	 static void printString(String[] str, String split_approach) {
		System.out.println("split approach");
		for(String st:str) {
			System.out.println(st);
		}
		
	}
	 
	 //part 2 try
//	 String stt="hari-priya";
//	 StringTokenizer stritok=new StringTokenizer(stt,"-");
//	 while(stritok.hasMoreTokens()) {
//		 String se=stt.nextToken();
//		 System.out.println(se);
//	 }

}


