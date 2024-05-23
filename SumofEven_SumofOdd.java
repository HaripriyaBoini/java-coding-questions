package package1;

public class SumofEven_SumofOdd {

	public static void main(String[] args) {
		int esum=0;
		int osum=0;
		for(int n=0;n<10;n++) {
			if(n%2==0) {
				esum=esum+n;
			}else {
				osum=osum+n;
			}
		}
System.out.println("sum of even"+esum);
System.out.println("sum of odd"+osum);
	}

}
