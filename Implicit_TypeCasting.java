package package1;

public class Implicit_TypeCasting {

	public static void main(String[] args) {
		byte b=12;
		int i;
		long l;
		double d;
		System.out.println("conversion of byte to int");
		i=b;
		System.out.println("b=" +b +"\n i="+i);
		System.out.println("conversion of int to double");
		d = i;
		System.out.println("i=" +i + "\n d="+d);

	}

}
//o/p:=======
//conversion of byte to int
//b=12
// i=12
//conversion of int to double
//i=12
// d=12.0