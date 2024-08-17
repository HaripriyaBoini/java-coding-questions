package Next_Education;

public class Reverse_word {

	public static void main(String[] args) {
		
		String str="I Love Programming";
		String splitword[]=str.split(" ");
		for(int i=splitword.length-1;i>=0;i--) {
			System.out.println(splitword[i]);      //Programming
			                                       //Love
			                                       //I
		}
		
	}

}
