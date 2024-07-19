package package1;

public class between {
	public static boolean isPrime(int c) {
	
		int count=0;
		for(int j =1;j<=c;j++) {
			if(c%j==0) {
				count++;
			}
			if(count==2) {
				return true;
			}
		}
			return false;
		
		
	}
	static void printPrimenos(int a,int b) {
		for(int i=a;i<=b;i++)
		{
			if(isPrime(i)){
			System.out.println(i+"\n");}
		}
	}
public static void main(String[] args) {
	
	printPrimenos(20,30);
			
}
}
