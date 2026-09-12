package strings.class_problems;

public class VowelConsonantCounter {
    
    public void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);
            
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.printf("Vowels: %d | Consonants: %d%n", vowels, consonants);
    }
    
    public static void main(String[] args) {
        VowelConsonantCounter counter = new VowelConsonantCounter();
        
        System.out.println("=== Vowel & Consonant Counter ===\n");
        
        counter.countVowelsAndConsonants("Java Programming");
        counter.countVowelsAndConsonants("Hello World");
        counter.countVowelsAndConsonants("AEIOU");
    }
}
