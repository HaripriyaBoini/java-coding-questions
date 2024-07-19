package package1;

import java.util.ArrayList;
import java.util.List;

public class Other_fibonacci_numbers_part2 {

	public static void main(String[] args) {
		List<Integer> fibonacciList=new ArrayList<>();
		List<Integer> nonfibonacciList=new ArrayList<>(); 

		int a=0;
		int b=1;int n=10;
		int c;
		fibonacciList.add(a);
		fibonacciList.add(b);
		while(true) {
			c=a+b;
			if(c>n) {
				break;
			}
			fibonacciList.add(c);
			a=b;
			b=c;
		}
		System.out.println("fibonacci list"+fibonacciList);
		
		for(int i=0;i<=n;i++) {
			if(!fibonacciList.contains(i)) {
				nonfibonacciList.add(i);
			}
		}
		System.out.println("nonfibonacciList"+nonfibonacciList);
		
		
	      
	}

}
