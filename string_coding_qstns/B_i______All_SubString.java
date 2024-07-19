package string_coding_qstns;

public class B_i______All_SubString {

	public static void main(String[] args) {
		String st1="hari";
		
		
		
		System.out.println("all the substrings are");
		int f=find_subString1(st1);
		System.out.println("no of substrings are"+f);
		
	}
	             
		static int find_subString1(String str) {
			
			int count=0;
			
			for(int i=0;i<str.length();i++) {
				for(int j=i+1;j<=str.length();j++) {
					System.out.println(str.substring(i,j));
					
					count++;
					
					
					
				}
				
			}
			return count;
		}
		
		

	}


