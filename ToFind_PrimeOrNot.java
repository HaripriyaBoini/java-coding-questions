package package1;

public class ToFind_PrimeOrNot {

	static boolean toFindNumPrimeOrNot(int n){
		int i=2;
		boolean res = true;
		
		for(;(i<n/2) && (n % i != 0);i++);
		
		if(i < n/2) res = false;
		return res;
	}
	public static void main(String[] args) {
	
		int num =9;
		System.out.println("Result----->"+toFindNumPrimeOrNot(num));
	
	
	}

		}
