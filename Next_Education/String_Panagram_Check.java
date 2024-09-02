package Next_Education;

import java.util.HashSet;
import java.util.Set;

public class String_Panagram_Check {

	public static void main(String[] args) {
	       String input = "The quick brown fox jumps over the lazy dog";

	        if (isPangram(input)) {
	            System.out.println("The string is a pangram.");
	        } else {
	            System.out.println("The string is not a pangram.");
	        }
	    }

	    public static boolean isPangram(String str) {
	        // Convert the string to lowercase to handle case insensitivity
	        str = str.toLowerCase();

	        // Create a set to track unique letters
	        Set<Character> letters = new HashSet<>();

	        // Loop through each character in the string
	        for (char c : str.toCharArray()) {
	            // Check if the character is a letter
	            if (Character.isLetter(c)) {
	                letters.add(c);
	            }
	        }

	        // A pangram must contain all 26 letters
	        return letters.size() == 26;

	}

}
