package data_structures_algorithms.class_problems;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        countVowelsAndConsonants("Programming");
        countVowelsAndConsonants("hello");
        countVowelsAndConsonants("aeiou");
    }
    
    static void countVowelsAndConsonants(String word) {
        int vowels = 0, consonants = 0;
        String vowelSet = "aeiouAEIOU";
        
        for (char c : word.toCharArray()) {
            if (vowelSet.indexOf(c) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        
        System.out.println(word + ":");
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
