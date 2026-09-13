package arrays_methods.class_problems;

import java.util.Arrays;

public class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;
    
    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }
    
    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }
    
    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }
    
    double getFantasyPoints() {
        return matchesPlayed * battingAverage / 10.0;
    }
    
    @Override
    public int compareTo(Player other) {
        // Sort by fantasy points descending
        return Double.compare(other.getFantasyPoints(), this.getFantasyPoints());
    }
    
    @Override
    public String toString() {
        return String.format("%s (%.1f)", name, getFantasyPoints());
    }
    
    public static String draftAndRank(Player[] players) {
        Player[] draftable = new Player[players.length];
        int count = 0;
        
        for (Player p : players) {
            if (isDraftable(p.matchesPlayed) || isDraftable(p.matchesPlayed, p.injured)) {
                draftable[count++] = p;
            }
        }
        
        Player[] final_draftable = Arrays.copyOf(draftable, count);
        Arrays.sort(final_draftable);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < final_draftable.length; i++) {
            if (i > 0) result.append(" | ");
            result.append((i + 1)).append(". ").append(final_draftable[i]);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Fantasy League Auto-Draft ===\n");
        
        Player[] players = {
            new Player("Virat", 15, 48.0, false),
            new Player("Rahul", 7, 55.0, false),
            new Player("Sameer", 3, 60.0, false),
            new Player("Dev", 12, 20.0, true)
        };
        
        System.out.println("Output: " + draftAndRank(players));
    }
}
