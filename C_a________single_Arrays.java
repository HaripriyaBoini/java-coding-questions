package package1;

public class C_a________single_Arrays {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};
		

        
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }
        
       
        System.out.println("Using enhanced for loop:");
        for (int element : array) {
            System.out.println("Element: " + element);
        }

	}

}
