package Next_Education;

import java.util.Arrays;

public class SQL {
//SELECT MAX(salary) AS second_highest_salary
//	FROM employees
//	WHERE salary < (SELECT MAX(salary) FROM employees);

	
	
	//Angrams
	
		public static boolean anag(String str1,String str2) {
		
		
		char[] char1=str1.toCharArray();
		char[] char2=str2.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		return Arrays.equals(char1, char2);
		
		}

		
	
		public static void main(String[] args) {
			
			String str1="haripriya";
			String str2="haripriyk";
		
			if(anag(str1,str2)) {
				System.out.println("anagrams");
			}else {
				System.out.println("not anags");
			}
		
		}
}
