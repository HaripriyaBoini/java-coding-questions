package package1;

import java.util.Scanner;

public class A_h______factorial_of_number {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
	
		int i=1;
		int fact=1;
		for( i=1;i<=num;i++) {
           fact=fact*i;
	}
		System.out.println("factorial of a number "+fact);

}
}
