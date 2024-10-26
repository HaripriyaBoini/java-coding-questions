package string_coding_qstns;

public class c_t______Rev_String_Using_Recursion {

	public static void main(String[] args) {
		String str="sandy";  //ydnas, 
		String ss=recursiveString(str);
		System.out.println(ss);

	}
	private static String recursiveString(String s) {
		if(s==null||s.length()<=1) {
			return s;
		}
		return recursiveString(s.substring(1))+s.charAt(0);
	}

}
 

//andy+s, a=ndy+a+s,  dy+n+a+s,  y+n+a+s+d  