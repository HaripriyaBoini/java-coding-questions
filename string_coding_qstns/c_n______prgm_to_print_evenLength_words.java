package string_coding_qstns;

public class c_n______prgm_to_print_evenLength_words {

	public static void main(String[] args) {
		String str="hari priya boini mu";
		for(String s:str.split("\\s+")) {
			if(s.length()%2==0) {
				System.out.println(s);
				
			}
		}

	}

}
