package Next_Education;

import java.util.Arrays;

public class Second_Largest_Number {
	public static void printsecond_largest(int arr[]) {
		int size=arr.length;
		if(size<2) {
			System.out.println("Invalid input");
			return;
		}
		Arrays.sort(arr);
		
		System.out.println("2nd largest number is");
		System.out.println(arr[size-3]);
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		printsecond_largest(arr);

	}

	

}
