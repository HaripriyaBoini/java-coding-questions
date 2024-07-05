package string_coding_qstns;

public class B_b______String_Equal_Check {

	public static void main(String[] args) {
		 String s1 = "hari_priya";
		 String s2 = "hari@priya";
	        System.out.println("Before strings are "+s1+" "+s2);
	        System.out.println();

	        if (s1.equals(s2)) {
	            System.out.println("The strings already equal.");
	        } else {
	            // Identify and remove the differing character
	            String modifiedS1 = s1;
	            String modifiedS2 = s2;
	            
	            
	          System.out.println(Math.min(s1.length(), s2.length()));  //Math.min(10,10)--------->ans : 10
	          
	            for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {  //i<10
	                if (s1.charAt(i) != s2.charAt(i)) {                              
	                    modifiedS1 = s1.substring(0, i) + s1.substring(i + 1);
	                    modifiedS2 = s2.substring(0, i) + s2.substring(i + 1);
	                    break;
	                }
	            }

	            // Compare the modified strings
	            if (modifiedS1.equals(modifiedS2)) {
	                System.out.println("The strings are equal after modification.");
	                System.out.println("Modified String 1: " + modifiedS1);
	                System.out.println("Modified String 2: " + modifiedS2);
	            } else {
	                System.out.println("The strings are still not equal after modification.");
	                System.out.println("Modified String 1: " + modifiedS1);
	                System.out.println("Modified String 2: " + modifiedS2);
	            }
	        }

	}

}
