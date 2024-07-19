package package1;

public class A_e____________split_or_divide_String {

	public static void main(String[] args) {
		
		//split() method
		String str="this is my book";
		String words[]=str.split(" ");
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

}
