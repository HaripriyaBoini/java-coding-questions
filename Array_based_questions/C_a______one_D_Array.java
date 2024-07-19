package Array_based_questions;

import java.util.Arrays;

public class C_a______one_D_Array {

	public static void main(String[] args) {
		
		String str[]= {"Red","green","blue"};
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		for(String s:str) {
			System.out.println("Using enhanced for loop"+s);
		}
		System.out.println("arrays as aslist:----------"+Arrays.asList(str));
		System.out.println("By using arrays.toString():--------  "  +Arrays.toString(str));
		
		int[][] arrn=new int[][]{{4,6,4},{1,1,6}};
		System.out.println("Arrays.deepToString:-----"+Arrays.deepToString(arrn));
	}

}
