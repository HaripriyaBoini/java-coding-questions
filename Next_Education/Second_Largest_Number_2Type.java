package Next_Education;

import java.util.Arrays;

public class Second_Largest_Number_2Type {
	public static void printsecond_largest(int arr[]) {
		int size=arr.length;
		
		Arrays.sort(arr);
		for(int i=size-2;i>=0;i--) {
			if(arr[i]!=arr[size-1]) {
				System.out.println("The second largest is"+arr[i]);
				return;
			}
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		printsecond_largest(arr);

	}

	

}
