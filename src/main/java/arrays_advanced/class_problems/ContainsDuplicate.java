package arrays_advanced.class_problems;

public class ContainsDuplicate {
    
    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        ContainsDuplicate solver = new ContainsDuplicate();
        
        System.out.println("=== Contains Duplicate ===\n");
        
        int[] test1 = {1, 2, 3, 1};
        System.out.printf("Input: [1, 2, 3, 1]\nOutput: %b\n\n", solver.containsDuplicate(test1));
        
        int[] test2 = {1, 2, 3, 4};
        System.out.printf("Input: [1, 2, 3, 4]\nOutput: %b\n", solver.containsDuplicate(test2));
    }
}
