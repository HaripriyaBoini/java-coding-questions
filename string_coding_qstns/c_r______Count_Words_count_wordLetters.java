package string_coding_qstns;

public class c_r______Count_Words_count_wordLetters {

	public static void main(String[] args) {
		String str="Hello Good Morning";
		count(str);

	}

	private static void count(String str) {
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			
			String s="";
			while(i<ch.length && ch[i]!=' ') {
				s=s+ch[i];
				i++;
			}
			if(s.length()>0) {
				System.out.print(s+" -_>"+s.length());
			}
			
		}
	}

}
