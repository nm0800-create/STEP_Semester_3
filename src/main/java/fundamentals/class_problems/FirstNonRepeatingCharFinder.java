package fundamentals.class_problems;

public class FirstNonRepeatingCharFinder {
    
    public char findFirstNonRepeatingChar(String text) {
        if (text == null || text.length() == 0) {
            return '\0'; // null character
        }
        
        // Count frequency of each character
        int[] frequency = new int[256]; // ASCII character array
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }
        
        // Scan left to right and find first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 1) {
                return c;
            }
        }
        
        return '\0'; // No non-repeating character found
    }
    
    public void findAndPrintNonRepeatingChar(String text) {
        char result = findFirstNonRepeatingChar(text);
        
        System.out.printf("Input: \"%s\"%n", text);
        
        if (result == '\0') {
            System.out.println("Result: No Non-Repeating Character Found\n");
        } else {
            System.out.printf("Result: First Non-Repeating Character: '%c'%n\n", result);
        }
    }
    
    public static void main(String[] args) {
        FirstNonRepeatingCharFinder finder = new FirstNonRepeatingCharFinder();
        
        System.out.println("=== Unique Letter Hunt Mini-Game ===\n");
        
        finder.findAndPrintNonRepeatingChar("swiss");
        finder.findAndPrintNonRepeatingChar("aabbcc");
        finder.findAndPrintNonRepeatingChar("leetcode");
        finder.findAndPrintNonRepeatingChar("abcdef");
    }
}
