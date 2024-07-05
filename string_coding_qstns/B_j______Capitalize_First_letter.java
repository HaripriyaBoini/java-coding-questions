package string_coding_qstns;

public class B_j______Capitalize_First_letter {

	public static void main(String[] args) {
String sentence = "capitalize the first letter of each word";
        
        // Capitalize first letter of each word
        String capitalizedSentence = capitalizeFirstLetter(sentence);
        
        // Print the capitalized sentence
        System.out.println("Original sentence: " + sentence);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }
    
    public static String capitalizeFirstLetter(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        
        // Capitalize the first letter of each word
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restLetters = word.substring(1).toLowerCase();
                sb.append(firstLetter).append(restLetters);
                if (i < words.length - 1) {
                    sb.append(" "); // Add space between words
                }
            }
        }
        
        return sb.toString();

	}

}
