package arrays_methods.class_problems;

public class MatchGridAnalyzer {
    
    private static double rowAverage(int[] row) {
        int sum = 0;
        for (int score : row) {
            sum += score;
        }
        return (double) sum / row.length;
    }
    
    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < runsPerOver.length; i++) {
            double average = rowAverage(runsPerOver[i]);
            String classification = average >= threshold ? "Power Surge" : "Normal";
            
            if (i > 0) result.append(" | ");
            result.append("Match ").append(i).append(": ").append(classification);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Match Day Grid Analyzer ===\n");
        
        int[][] runsPerOver = {
            {4, 6, 8},
            {10, 12, 14},
            {2, 3, 1}
        };
        int threshold = 8;
        
        System.out.println("Input: Grid with threshold = 8");
        System.out.println("Output: " + classifyMatches(runsPerOver, threshold));
    }
}
