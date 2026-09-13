package arrays_methods.class_problems;

public class DuplicatePlayerChecker {
    
    public static String findDuplicatePick(String[] playerNames) {
        for (int i = 0; i < playerNames.length; i++) {
            for (int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i].equals(playerNames[j])) {
                    return "Duplicate Found: " + playerNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }
    
    public static void main(String[] args) {
        System.out.println("=== Duplicate Player Pick Checker ===\n");
        
        String[] lineup1 = {"Kohli", "Bumrah", "Kohli", "Rohit"};
        System.out.println("Input: [Kohli, Bumrah, Kohli, Rohit]");
        System.out.println("Output: " + findDuplicatePick(lineup1) + "\n");
        
        String[] lineup2 = {"Kohli", "Bumrah", "Rohit"};
        System.out.println("Input: [Kohli, Bumrah, Rohit]");
        System.out.println("Output: " + findDuplicatePick(lineup2));
    }
}
