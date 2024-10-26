package package1;

public class Swap_wo_var {

	public static void main(String[] args) {
		int a=55;
		int b=43;
		System.out.println("Before swap a="+a+" b="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap a="+a+" b= "+b);

	}

}
