package strings.assignment_problems;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class StopWordFilteredFrequencyReport {
    
    public void printFilteredWordFrequency(String feedback) {
        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};
        
        // Normalize: lowercase and remove punctuation
        String normalized = feedback.toLowerCase().replace(".", "").replace(",", "").replace("!", "");
        
        // Split into words
        String[] words = normalized.split("\\s+");
        
        // Count frequencies (skip stop words)
        HashMap<String, Integer> frequency = new HashMap<>();
        
        for (String word : words) {
            if (word.isEmpty()) continue;
            
            // Check if word is a stop word
            boolean isStopWord = false;
            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }
            
            if (!isStopWord) {
                frequency.put(word, frequency.getOrDefault(word, 0) + 1);
            }
        }
        
        // Sort by frequency (descending) using ArrayList
        ArrayList<String> sortedWords = new ArrayList<>(frequency.keySet());
        Collections.sort(sortedWords, (w1, w2) -> frequency.get(w2) - frequency.get(w1));
        
        // Print results
        for (String word : sortedWords) {
            System.out.println(word + ": " + frequency.get(word));
        }
    }
    
    public static void main(String[] args) {
        StopWordFilteredFrequencyReport report = new StopWordFilteredFrequencyReport();
        
        System.out.println("=== Stop-Word-Filtered Word Frequency Report ===\n");
        
        System.out.println("Input: \"The mentor was great, the session was great and clear.\"");
        System.out.println("Output:");
        report.printFilteredWordFrequency("The mentor was great, the session was great and clear.");
    }
}
