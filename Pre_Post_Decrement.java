package package1;

public class Pre_Post_Decrement {

	public static void main(String[] args) {
		int a=1,b=2,c,d;
		c=--b;
		d=a--;
		c--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}

//o/p:---------
//0
//1
//0
//1
