package string_coding_qstns;

public class B_i______Check_char_digit {

	public static void main(String[] args) {
		String st="hari1pr7iya";
		int count=0;
		for(int i=0;i<st.length();i++) {
			Character ch=st.charAt(i);
			if(Character.isLetterOrDigit(st.charAt(i))){
				count++;
			}
		}
System.out.println("no of digits are"+count);


	}

}
