package string_coding_qstns;

public class c_s______Extract_First_letter_String {

	public static void main(String[] args) {
		String str="Hello good morning";
		splitWords(str);
		

	}

	private static void splitWords(String str) {
		String words[] =str.split(" ");
		for(int i=0;i<words.length;i++) {     //3
			String s=words[i];              //hello good morning 
			System.out.println(s.charAt(0));    //h g m
		}
		
	}

}
