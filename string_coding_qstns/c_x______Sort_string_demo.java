package string_coding_qstns;

import java.util.Arrays;

public class c_x______Sort_string_demo {

	public static void main(String[] args) {
		
		String str="haripriya";
		char ch[]=str.toCharArray();

		Arrays.sort(ch);
		
		String sortedStr=new String(ch);
		System.out.println(sortedStr);
		

	}

}
