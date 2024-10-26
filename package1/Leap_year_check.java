package package1;

import java.util.Scanner;

public class Leap_year_check {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		System.out.println(year);
		
		if((year%400==0&&year%4==0)||(year%100!=0)) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+"is not a leapp year");
		}

	}

}
