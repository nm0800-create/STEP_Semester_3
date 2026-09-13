package arrays_methods.assignment_problems;

import java.util.Arrays;

public class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;
    
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }
    
    static boolean isEligible(double cgpa) {
        return cgpa >= 8.0;
    }
    
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 7.0 && codingScore >= 60;
    }
    
    double getCompositeScore() {
        return (cgpa * 10) + (codingScore * 0.5);
    }
    
    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }
    
    @Override
    public String toString() {
        return String.format("%s (%.1f)", name, getCompositeScore());
    }
    
    public static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] shortlisted = new Candidate[candidates.length];
        int count = 0;
        
        for (Candidate c : candidates) {
            if (isEligible(c.cgpa) || isEligible(c.cgpa, c.codingScore)) {
                shortlisted[count++] = c;
            }
        }
        
        Candidate[] final_shortlisted = Arrays.copyOf(shortlisted, count);
        Arrays.sort(final_shortlisted);
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < final_shortlisted.length; i++) {
            if (i > 0) result.append(" | ");
            result.append((i + 1)).append(". ").append(final_shortlisted[i]);
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Placement Drive Shortlisting & Ranking ===\n");
        
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        
        System.out.println("Output: " + shortlistAndRank(candidates));
    }
}
