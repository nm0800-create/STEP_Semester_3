package data_structures_algorithms.assignment_problems;

public class ClassAttendanceTracker {
    static int[] attendanceSummary(int[] days) {
        int presentDays = 0, maxStreak = 0, currentStreak = 0;
        
        for (int day : days) {
            if (day == 1) {
                presentDays++;
                currentStreak++;
                maxStreak = Math.max(maxStreak, currentStreak);
            } else {
                currentStreak = 0;
            }
        }
        
        return new int[]{presentDays, maxStreak};
    }
    
    public static void main(String[] args) {
        int[] days1 = {1, 1, 0, 1, 1, 1, 0, 1};
        int[] result1 = attendanceSummary(days1);
        System.out.println("Present: " + result1[0] + ", Longest streak: " + result1[1]);
        
        int[] days2 = {0, 0, 0};
        int[] result2 = attendanceSummary(days2);
        System.out.println("Present: " + result2[0] + ", Longest streak: " + result2[1]);
    }
}
