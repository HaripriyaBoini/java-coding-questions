package package1;

public class Factorsof20_________________ {

    public static void main(String[] args) {
    	
    	
        int n = 20;
        int maxPrimeFactor = findMaxPrimeFactor(n);
        System.out.println("The maximum prime factor of " + n + " is: " + maxPrimeFactor);
    }

    private static int findMaxPrimeFactor(int n) {
        int maxPrime = -1; // Initialize with -1 to handle cases where no prime factors are found

        // Check for number of 2s that divide n
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }

        // Check for odd factors from 3 onwards
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }

        // If n is still a prime number and greater than 2
        if (n > 2) {
            maxPrime = n;
        }

        return maxPrime;
    }

    	
    	
    	
    	
    	
    	
    }
    
    
    

    	
    	
    	
    	

