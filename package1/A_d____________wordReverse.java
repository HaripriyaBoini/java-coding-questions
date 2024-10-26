package package1;

public class A_d____________wordReverse {

	public static void main(String[] args) {
		
		
		String str = "Welcome to java world";
		System.out.println("before wordreverse:----------"+str);
		String splitArray[] =str.split(" ");
		
		for(int i=splitArray.length-1;i>=0;i--) {  //welcome to java world------->world java to welcome
			System.out.print(splitArray[i]+" ");
		}
		
		
	}

}
