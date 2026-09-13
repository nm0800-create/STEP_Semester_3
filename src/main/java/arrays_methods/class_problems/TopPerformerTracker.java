package arrays_methods.class_problems;

public class TopPerformerTracker {
    
    public static String findMinMaxSpread(int[] scores) {
        int min = scores[0];
        int max = scores[0];
        
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) min = scores[i];
            if (scores[i] > max) max = scores[i];
        }
        
        int spread = max - min;
        return String.format("Min: %d | Max: %d | Spread: %d", min, max, spread);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Top Performer Tracker ===\n");
        
        int[] scores1 = {45, 82, 79, 90, 33, 90, 61};
        System.out.println("Input: [45, 82, 79, 90, 33, 90, 61]");
        System.out.println("Output: " + findMinMaxSpread(scores1));
    }
}
