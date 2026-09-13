package arrays_methods.assignment_problems;

import java.util.Arrays;

public class Top3PodiumFinder {
    
    public static int[] findTopThreeScores(int[] scores) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        
        for (int score : scores) {
            if (score > first) {
                third = second;
                second = first;
                first = score;
            } else if (score > second) {
                third = second;
                second = score;
            } else if (score > third) {
                third = score;
            }
        }
        
        return new int[]{first, second, third};
    }
    
    public static void main(String[] args) {
        System.out.println("=== Top-3 Podium Finder ===\n");
        
        int[] scores = {45, 82, 79, 90, 33, 90, 61};
        int[] topThree = findTopThreeScores(scores);
        System.out.println("Input: [45, 82, 79, 90, 33, 90, 61]");
        System.out.println("Output: " + Arrays.toString(topThree));
    }
}
