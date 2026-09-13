package arrays_advanced.class_problems;

public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        // Nested loops to check every pair
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    
    public static void main(String[] args) {
        TwoSum solver = new TwoSum();
        
        System.out.println("=== Two Sum ===\n");
        
        int[] test1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solver.twoSum(test1, target1);
        System.out.printf("Input: nums = [2, 7, 11, 15], target = 9\n");
        System.out.printf("Output: [%d, %d]%n\n", result1[0], result1[1]);
        
        int[] test2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solver.twoSum(test2, target2);
        System.out.printf("Input: nums = [3, 2, 4], target = 6\n");
        System.out.printf("Output: [%d, %d]%n", result2[0], result2[1]);
    }
}
