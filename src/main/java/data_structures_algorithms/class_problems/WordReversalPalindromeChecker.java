package data_structures_algorithms.class_problems;

public class WordReversalPalindromeChecker {
    public static void main(String[] args) {
        checkPalindrome("level");
        checkPalindrome("java");
        checkPalindrome("racecar");
    }
    
    static void checkPalindrome(String word) {
        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();
        String reversedStr = reversed.toString();
        
        boolean isPalindrome = word.equalsIgnoreCase(reversedStr);
        System.out.println(word + " - " + (isPalindrome ? "palindrome" : "not a palindrome"));
    }
}
