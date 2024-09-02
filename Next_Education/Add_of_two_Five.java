package Next_Education;

import java.util.HashSet;
import java.util.Set;


public class Add_of_two_Five {

	public static void main(String[] args) {
		
	      int a[] = {1, 2, 5, 0, 3, 6, 4};
	        int target = 5;

	        // Find primes in the array
	        HashSet<Integer> primes = new HashSet<>();
	        for (int num : a) {
	            if (isPrime(num)) {
	                primes.add(num);
	            }
	        }

	        // Find pairs of primes that sum up to the target
	        Set<Integer> result = new HashSet<>();
	        for (int prime1 : primes) {
	            for (int prime2 : primes) {
	                if (prime1 != prime2 && prime1 + prime2 == target) {
	                    result.add(prime1);
	                    result.add(prime2);
	                }
	            }
	        }

	        // Print the result
	        System.out.println(result);
	    }

	    // Helper function to check if a number is prime
	    private static boolean isPrime(int num) {
	        if (num <= 1) return false;
	        if (num <= 3) return true;
	        if (num % 2 == 0 || num % 3 == 0) return false;
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) return false;
	        }
	        return true;

}
}
