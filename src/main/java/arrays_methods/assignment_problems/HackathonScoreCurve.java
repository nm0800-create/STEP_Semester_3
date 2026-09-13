package arrays_methods.assignment_problems;

import java.util.Arrays;

public class HackathonScoreCurve {
    
    public static void curveScores(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Hackathon Score Curve Booster ===\n");
        
        int[] scores = {70, 85, 60};
        System.out.println("Original: " + Arrays.toString(scores));
        
        curveScores(scores, 10);
        System.out.println("After bonus (+10): " + Arrays.toString(scores));
    }
}
