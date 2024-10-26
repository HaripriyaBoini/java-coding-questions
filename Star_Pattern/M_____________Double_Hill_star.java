package Star_Pattern;

public class M_____________Double_Hill_star {

	public static void main(String[] args) {
//		*             *
//		**           **
//		***         ***
//		****       ****
//		*****     *****
//		******   ******
//		******* *******
//		***************
		
	     int numRows = 10;

	        // Loop through each row
	        for (int i = 1; i <= numRows; i++) {
	            // Print stars in the first column
	            for (int j = 1; j <=i; j++) {
	                System.out.print("*");
	            }

	             //Print spaces between the two columns
	            int numSpaces = (numRows * 2) - (i * 2);
	            for (int j = 1; j <= numSpaces; j++) {
	                System.out.print(" ");
	            }

//	            // Print stars in the second column
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // Move to the next line after finishing the row
	            System.out.println();
	        }

	}

}
