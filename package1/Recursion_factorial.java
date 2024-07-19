package package1;

public class Recursion_factorial {

	public static void main(String[] args) {
		int number=5;
		System.out.println("the factorial of a number is"+factorial(number));
		

}

	static int factorial(int n) {
		
		if(n==0) {
			return 1;
		}else
			return (n*factorial(n-1));
		
	}
}
