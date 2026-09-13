package arrays_methods.assignment_problems;

public class SeatingGridOptimizer {
    
    private static double rowAverage(int[] row) {
        int sum = 0;
        for (int score : row) {
            sum += score;
        }
        return (double) sum / row.length;
    }
    
    public static String classifyRows(int[][] seatingScores, int threshold) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < seatingScores.length; i++) {
            double average = rowAverage(seatingScores[i]);
            String classification = average < threshold ? "Quiet Zone" : "Buzzing Zone";
            
            if (i > 0) result.append(" | ");
            result.append("Row ").append(i).append(": ").append(classification);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Hackathon Seating Grid Optimizer ===\n");
        
        int[][] seatingScores = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };
        int threshold = 60;
        
        System.out.println("Input: Grid with threshold = 60");
        System.out.println("Output: " + classifyRows(seatingScores, threshold));
    }
}
