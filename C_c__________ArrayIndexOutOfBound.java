package package1;

public class C_c__________ArrayIndexOutOfBound {

	public static void main(String[] args) {
		   int[] numbers = {1, 2, 3, 4, 5};

	        // Attempting to access an index out of the array's bounds
	        try {
	            int invalidIndexElement = numbers[10]; // This will throw ArrayIndexOutOfBoundsException
	            System.out.println("Element at index 10: " + invalidIndexElement);
	            
	            
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("ArrayIndexOutOfBoundsException caught!");
	            System.out.println("Message: " + e.getMessage());
	        }

	}

}
