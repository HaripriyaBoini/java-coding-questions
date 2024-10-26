package package1;

import java.util.Scanner;

public class Print_largest_value {

	public static void main(String[] args) {
		int x=2;
		int y=77;
		int z=9;
		
		if((x>y)&&(x>z))
		{
			System.out.println("x is largest");
		}
		if((y>z)&&(y>x))
		{
			System.out.println("y is largest");
		}
		if((z>y)&&(z>x))
		{
			System.out.println("z is largest");
		}
		
		// 2nd way if more than 3 numbers
		
		int[] n= {2,5,3,7,9,42,0};
		int largest=n[5];
		for(int i=0;i<n.length;i++) {
			if(n[i]>largest) {
				largest=n[i];
				
				
			}
			
		}System.out.println(largest+"is large number");
		
		
		
		
		
		
		
		
		
		
	}

}
