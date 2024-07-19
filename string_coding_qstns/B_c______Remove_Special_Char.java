package string_coding_qstns;

public class B_c______Remove_Special_Char {

	public static void main(String[] args) {
		String s1 = "hari_priya";
        String s2 = "harip@riya";

        // Remove special characters from both strings
        String modifiedS1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        String modifiedS2 = s2.replaceAll("[^a-zA-Z0-9]", "");

        // Compare the modified strings
        if (modifiedS1.equals(modifiedS2)) {
            System.out.println("The strings are equal after removing special characters.");
            System.out.println("Modified String 1: " + modifiedS1);
            System.out.println("Modified String 2: " + modifiedS2);
        } else {
            System.out.println("The strings are still not equal after removing special characters.");
            System.out.println("Modified String 1: " + modifiedS1);
            System.out.println("Modified String 2: " + modifiedS2);
        }

	}

}
