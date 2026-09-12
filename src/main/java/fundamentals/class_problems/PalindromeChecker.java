package fundamentals.class_problems;

public class PalindromeChecker {
    
    // Approach 1: Iterative comparison
    public boolean isPalindromeIterative(String text) {
        // Remove spaces and convert to lowercase
        text = text.replaceAll(" ", "").toLowerCase();
        
        int left = 0;
        int right = text.length() - 1;
        
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    // Approach 2: Recursive comparison
    public boolean isPalindromeRecursive(String text) {
        // Remove spaces and convert to lowercase
        text = text.replaceAll(" ", "").toLowerCase();
        
        return isPalindromeRecursiveHelper(text, 0, text.length() - 1);
    }
    
    private boolean isPalindromeRecursiveHelper(String text, int left, int right) {
        // Base case: if pointers meet or cross, it's a palindrome
        if (left >= right) {
            return true;
        }
        
        // If characters don't match, not a palindrome
        if (text.charAt(left) != text.charAt(right)) {
            return false;
        }
        
        // Recursively check the rest
        return isPalindromeRecursiveHelper(text, left + 1, right - 1);
    }
    
    // Approach 3: Array reversal
    public boolean isPalindromeArrayReversal(String text) {
        // Remove spaces and convert to lowercase
        text = text.replaceAll(" ", "").toLowerCase();
        
        // Convert to character array
        char[] chars = text.toCharArray();
        
        // Reverse the array
        char[] reversed = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            reversed[i] = chars[chars.length - 1 - i];
        }
        
        // Compare original and reversed
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != reversed[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public void checkPalindrome(String text) {
        boolean iterative = isPalindromeIterative(text);
        boolean recursive = isPalindromeRecursive(text);
        boolean arrayReversal = isPalindromeArrayReversal(text);
        
        String iterResult = iterative ? "Palindrome" : "Not Palindrome";
        String recurResult = recursive ? "Palindrome" : "Not Palindrome";
        String arrayResult = arrayReversal ? "Palindrome" : "Not Palindrome";
        
        System.out.printf("Input: \"%s\"%n", text);
        System.out.printf("Iterative: %s | Recursive: %s | Array Reversal: %s%n", 
                         iterResult, recurResult, arrayResult);
        
        // Verify all three approaches agree
        if (iterative == recursive && recursive == arrayReversal) {
            System.out.println("✓ All three approaches agree.\n");
        } else {
            System.out.println("✗ Approaches disagree (ERROR).\n");
        }
    }
    
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        
        System.out.println("=== Palindrome Checker - 3 Approaches ===\n");
        
        checker.checkPalindrome("madam");
        checker.checkPalindrome("hello");
        checker.checkPalindrome("racecar");
        checker.checkPalindrome("A man a plan a canal Panama");
    }
}
