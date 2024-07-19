package package1;

import java.util.Scanner;

public class Print_Prime_Numbers_uptoRANGE {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the range to find prime numbers below it: ");
        int range = scanner.nextInt();
        
        System.out.println("Prime numbers below " + range + ":");
        for (int i = 2; i < range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        
        scanner.close();
    }
    
    // Function to check if a number is prime
    static boolean isPrime(int n){
    int i=2;
	boolean res = true;
	
	for(;(i<n/2) && (n % i != 0);i++);
	
	if(i < n/2) res = false;
	return res;
}
    
    
}  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

