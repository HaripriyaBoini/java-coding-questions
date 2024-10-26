package string_coding_qstns;

import java.util.HashMap;
import java.util.Map;

public class c_w______Display_duplicate_character_count {

    public static void main(String[] args) {
        String str = "haripriyaa";
        
        Map<Character, Integer> charCountMap = new HashMap<>();
        char[] charArray = str.toCharArray();
        
        for (char c : charArray) {
            // Check if the character is already in the map
            if (charCountMap.containsKey(c)) {
                // Increment the count of the existing character
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Initialize the count for a new character
                charCountMap.put(c, 1); 
            }
        }
        
        System.out.println("Duplicate characters and their counts:");
        
        // Iterate through the map and print characters with count greater than 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
