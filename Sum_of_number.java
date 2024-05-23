package package1;

public class Sum_of_number {

	public static void main(String[] args) {
		int n=7868;
		int sum=0;
		
		int originalNum=n;
		while(n>0) {
			
			sum = sum + (n%10); //0+4  4+3  7+2 9+1
			n=n/10;           //123  12    1  0
			
		}
		System.out.println("sum of "+originalNum+"is "+sum);

	}

}
