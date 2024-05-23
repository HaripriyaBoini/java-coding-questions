package package1;

public class Rev_of_string {

	public static void main(String[] args) {
		String str="hello";
		String str2="";
		for(int i=str.length()-1; i>=0; i--) {
			str2=str2+str.charAt(i);
		}
		System.out.println("rev of a string is"+str2);
		

	}

}
