package package1;

import java.util.ArrayList;
import java.util.List;

public class Other_Fibonacci_Numbersk {

	public static void main(String[] args) {
		
		int[] array=otherFibonacci(10);
		for(int num:array) {
			System.out.println("Other fibonacci numbers are "+num+" ");
		}
	}
		
		static int[] otherFibonacci(int n) {
			
			List<Integer> fibonacciList=new ArrayList<>();
			List<Integer> nonfibonacciList=new ArrayList<>();
			
			int a=0;
			int b=1;
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


			int[] nonFibonacciArray=new int[nonfibonacciList.size()];
			
			for(int i=0;i<nonfibonacciList.size();i++) {
				nonFibonacciArray[i]=nonfibonacciList.get(i);
			}
				return nonFibonacciArray;
			
			
				
			
			
			
		}
		
	}


