package data_structures_algorithms.class_problems;

public class WordReversalPalindromeChecker {
    public static void main(String[] args) {
        checkPalindrome("level");
        checkPalindrome("java");
    }

    static void checkPalindrome(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        String verdict = word.equals(reversed) ? "palindrome" : "not a palindrome";
        System.out.println(reversed + " - " + verdict);
    }
}
