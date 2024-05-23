package package1;

public class Explicit_TypeCasting {

	public static void main(String[] args) {
		byte b;
		int i=23;
		double d=321.51;
		System.out.println("\n conversion of int to byte");
		b=(byte)i;
		System.out.println("i="+i + "\n b=" +b);
		System.out.println("conversion of double to int");
		i=(int)d;
		System.out.println("d="+d + "\n i=" +i);
		

	}
}


//o/p:------
//conversion of int to byte
//i=23
// b=23
//conversion of double to int
//d=321.51
// i=321

