package fundamentals.assignment_problems;

public class CheckDuplicateSeats {
    
    public void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;
        
        // Compare every seat number against every other seat number
        for (int i = 0; i < seatNumbers.length; i++) {
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                }
            }
        }
        
        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }
    
    public static void main(String[] args) {
        CheckDuplicateSeats checker = new CheckDuplicateSeats();
        
        // Test case 1: With duplicates
        int[] test1 = {101, 102, 103, 102, 105};
        System.out.println("Test 1 - Input: {101, 102, 103, 102, 105}");
        checker.checkDuplicateSeats(test1);
        
        System.out.println();
        
        // Test case 2: Without duplicates
        int[] test2 = {101, 102, 103, 104, 105};
        System.out.println("Test 2 - Input: {101, 102, 103, 104, 105}");
        checker.checkDuplicateSeats(test2);
    }
}
