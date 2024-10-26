package Next_Education;

import java.io.IOException;
import java.util.ArrayList;

public class Max_fact_of_20 {

	public static void main(String[] args) throws IOException{
		
		ArrayList<Integer> aa=new ArrayList<>();
		int n=20;
		for(int i=2;i<n;i++) {
			if(isPrime(i)) {
				
				
				if(n%i==0) {
					aa.add(i);
//					System.out.println(i);
					
				}
				if (!aa.isEmpty()) {
		            int max = aa.get(0);
		            for (int factor : aa) {
		                if (factor > max) {
		                    max = factor;
		                }
		            }
		            System.out.println("Maximum prime factor: " + max);
		        }
			}
		}
				
				
			
		

	}

	private static boolean isPrime(int n) {
		 int i=2;
			boolean res = true;
			
			for(;(i<n/2) && (n % i != 0);i++);
			
			if(i < n/2) res = false;
			return res;
		}

}
