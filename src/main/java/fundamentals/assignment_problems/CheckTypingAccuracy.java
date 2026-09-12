package fundamentals.assignment_problems;

public class CheckTypingAccuracy {
    
    public void checkTypingAccuracy(String original, String typed) {
        int matchedCount = 0;
        int firstMismatchPos = -1;
        char originalChar = ' ';
        char typedChar = ' ';
        
        // Compare character by character
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matchedCount++;
            } else if (firstMismatchPos == -1) {
                // Record the first mismatch position
                firstMismatchPos = i + 1; // 1-indexed for display
                originalChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }
        
        // Calculate accuracy percentage
        double accuracy = (matchedCount / (double) original.length()) * 100;
        
        // Print results
        System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | ", matchedCount, original.length(), accuracy);
        
        if (firstMismatchPos == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.printf("First Mismatch at position %d ('%c' vs '%c')%n", 
                            firstMismatchPos, originalChar, typedChar);
        }
    }
    
    public static void main(String[] args) {
        CheckTypingAccuracy checker = new CheckTypingAccuracy();
        
        // Test case 1: With mismatch
        System.out.println("Test 1 - original=\"hello world\", typed=\"hello worlt\"");
        checker.checkTypingAccuracy("hello world", "hello worlt");
        
        System.out.println();
        
        // Test case 2: Perfect match
        System.out.println("Test 2 - original=\"coding\", typed=\"coding\"");
        checker.checkTypingAccuracy("coding", "coding");
    }
}
