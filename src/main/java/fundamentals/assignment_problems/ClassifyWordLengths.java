package fundamentals.assignment_problems;

public class ClassifyWordLengths {
    
    public void classifyWordLengths(String review) {
        // Split review into individual words
        String[] words = review.split("\\s+");
        
        int shortCount = 0;    // 1-4 letters
        int mediumCount = 0;   // 5-8 letters
        int longCount = 0;     // 9+ letters
        
        // Classify each word by length
        for (int i = 0; i < words.length; i++) {
            // Remove punctuation for accurate length counting
            String cleanWord = words[i].replaceAll("[^a-zA-Z]", "");
            int length = cleanWord.length();
            
            if (length >= 1 && length <= 4) {
                shortCount++;
            } else if (length >= 5 && length <= 8) {
                mediumCount++;
            } else if (length >= 9) {
                longCount++;
            }
        }
        
        // Print the word length breakdown
        System.out.printf("Short: %d | Medium: %d | Long: %d%n", shortCount, mediumCount, longCount);
    }
    
    public static void main(String[] args) {
        ClassifyWordLengths classifier = new ClassifyWordLengths();
        
        // Test case 1
        System.out.println("Test 1 - Input: \"This movie was absolutely fantastic and thrilling\"");
        classifier.classifyWordLengths("This movie was absolutely fantastic and thrilling");
        
        System.out.println();
        
        // Test case 2
        System.out.println("Test 2 - Input: \"A great film!\"");
        classifier.classifyWordLengths("A great film!");
    }
}
