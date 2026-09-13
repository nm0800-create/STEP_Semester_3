package arrays_methods.assignment_problems;

public class DuplicateTeamFinder {
    
    public static String findDuplicateTeam(String[] teamNames) {
        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }
    
    public static void main(String[] args) {
        System.out.println("=== Duplicate Team Name Finder ===\n");
        
        String[] teams1 = {"ByteForce", "CodeCrafters", "ByteForce"};
        System.out.println("Input: [ByteForce, CodeCrafters, ByteForce]");
        System.out.println("Output: " + findDuplicateTeam(teams1) + "\n");
        
        String[] teams2 = {"ByteForce", "CodeCrafters", "NullPointers"};
        System.out.println("Input: [ByteForce, CodeCrafters, NullPointers]");
        System.out.println("Output: " + findDuplicateTeam(teams2));
    }
}
