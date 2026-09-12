package fundamentals.assignment_problems;

public class FindLongestStreak {
    
    public void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.length() == 0) {
            return;
        }
        
        char longestColor = signalLog.charAt(0);
        int longestLength = 1;
        char currentColor = signalLog.charAt(0);
        int currentLength = 1;
        
        // Scan through the string and track streak lengths
        for (int i = 1; i < signalLog.length(); i++) {
            if (signalLog.charAt(i) == currentColor) {
                // Same color continues
                currentLength++;
            } else {
                // Color changed, check if current streak is the longest
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    longestColor = currentColor;
                }
                // Reset for new color
                currentColor = signalLog.charAt(i);
                currentLength = 1;
            }
        }
        
        // Check final streak against longest
        if (currentLength > longestLength) {
            longestLength = currentLength;
            longestColor = currentColor;
        }
        
        // Print result
        System.out.printf("Longest Streak: '%c' repeated %d times%n", longestColor, longestLength);
    }
    
    public static void main(String[] args) {
        FindLongestStreak analyzer = new FindLongestStreak();
        
        // Test case 1
        System.out.println("Test 1 - Input: \"RRGGGYRR\"");
        analyzer.findLongestStreak("RRGGGYRR");
        
        System.out.println();
        
        // Test case 2
        System.out.println("Test 2 - Input: \"RRRRYYGG\"");
        analyzer.findLongestStreak("RRRRYYGG");
    }
}
