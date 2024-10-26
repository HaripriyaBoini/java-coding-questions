package Array_based_questions;

import java.util.Arrays;

public class C_b_________Two_d_array {

	public static void main(String[] args) {
		
		int[][] matrix = {
	            {1, 2, 3, 4},
	            {5, 6, 7, 8},
	            {9, 10, 11, 12}
	        };
		
		System.out.println("matrix.length"+matrix.length);

	        // Display all elements of the 2D array
	        for (int i = 0; i < matrix.length; i++) {          //i<3
	            for (int j = 0; j < matrix[i].length; j++) {
	            	
	            	
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	        
	        int[][] arrn=new int[][]{{4,6,4},{1,1,6}};
			System.out.println("Arrays.deepToString:-----"+Arrays.deepToString(arrn));
		
	}

}
