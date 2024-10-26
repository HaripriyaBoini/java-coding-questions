package package1;

import java.util.Scanner;

public class Range {
	
	static boolean isPrime(int num) {
		
		if (num <= 1) {
	        return false;
	    }
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
		
	
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int range=scanner.nextInt();
		System.out.println("enter the range to find prime numbers between"+range);
		
		System.out.println("prime numbers below"+range+"are");
		for(int i=2;i<range;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				
			}
		}
		scanner.close();
	}

}
