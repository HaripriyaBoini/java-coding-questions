package Array_based_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C_h______Remove_elem_in_Array {

	public static void main(String[] args) {
		
		
		int[] a= {2,6,4,7,9};
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==6) 
			continue;
			
	
			list.add(a[i]);
			}
		System.out.println("after removed"+list);
		}
}
		
//		int removelem=8;
//		int[] array1= new int[4];
//		 array1[0]=2;
//		 array1[1]=21;
//		 array1[2]=5;
//		 array1[3]=8;
//		
//		int[] array2=removeElement(removelem,array1);
//		System.out.println(Arrays.toString(array2));}
//
//	private static int[] removeElement(int removelem, int[] array5) {
//		int count=0;
//		for(int a=0;a<array5.length;a++) {
//			if(array5[a]==removelem) {
//				count++;
//				continue;
//			}}
//		if(count==1) {
//			return array5;}
//		return array5;
		
	
		
		
	
	
		
		
		
			
		
	

		
		
		
		
		
		
		
		
	

