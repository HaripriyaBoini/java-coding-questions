package string_coding_qstns;

public class B_f____count_vowels_cons {

	public static void main(String[] args) {
		String str="haripriya";
		int vowelcount=0;
		int consCount=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelcount++;
			}else if(ch>='a'&&ch<='z') {
				consCount++;
				
				}
			}
		System.out.println("no of vowels are "+vowelcount);
		System.out.println("no of consonants are "+consCount);
		}

	}


