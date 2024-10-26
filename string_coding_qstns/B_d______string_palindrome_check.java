package string_coding_qstns;

public class B_d______string_palindrome_check {
	

	public static void main(String[] args) {
		
		
		
		String st1="madam";
		boolean stringcheck=palindrome_Check(st1);
		
		System.out.println("it is palindrome string "+stringcheck);

	}

	 static boolean palindrome_Check(String st1) {
		for(int i=0;i<st1.length()/2;i++) {
			if(st1.charAt(i)!=st1.charAt(st1.length()-i-1)) {
				return false;
			}
			
		}
		
		return true;
	}

}
