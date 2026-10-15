package data_structures_algorithms.class_problems;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        countVowelsAndConsonants("Programming");
    }

    static void countVowelsAndConsonants(String word) {
        int vowels = 0, consonants = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowels++;
            else consonants++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
