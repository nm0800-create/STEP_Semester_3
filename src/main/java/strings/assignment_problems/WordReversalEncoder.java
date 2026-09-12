package strings.assignment_problems;

public class WordReversalEncoder {
    
    public String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversed = "";
            
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed += word.charAt(j);
            }
            
            if (i > 0) {
                result.append(" ");
            }
            result.append(reversed);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        WordReversalEncoder encoder = new WordReversalEncoder();
        
        System.out.println("=== Word Reversal Encoder ===\n");
        
        System.out.println("Input: 'hello club'");
        System.out.println("Output: " + encoder.reverseEachWord("hello club"));
        System.out.println();
        
        System.out.println("Input: 'java programming'");
        System.out.println("Output: " + encoder.reverseEachWord("java programming"));
    }
}
