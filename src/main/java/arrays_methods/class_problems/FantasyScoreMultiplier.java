package arrays_methods.class_problems;

import java.util.Arrays;

public class FantasyScoreMultiplier {
    
    public static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        // Captain gets 2x multiplier
        playerScores[captainIndex] *= 2.0;
        
        // Vice-Captain gets 1.5x multiplier
        playerScores[viceCaptainIndex] *= 1.5;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Fantasy Team Score Multiplier ===\n");
        
        double[] scores = {40, 55, 30, 62};
        System.out.println("Original scores: " + Arrays.toString(scores));
        
        applyMultipliers(scores, 1, 3);
        System.out.println("After multipliers (captain=1, viceCapt=3): " + Arrays.toString(scores));
        System.out.println("(Index 1: 55 → 110.0, Index 3: 62 → 93.0)");
    }
}
