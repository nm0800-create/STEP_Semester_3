package arrays_advanced.assignment_problems;

public class MaximumSubarray {
    
    public int maxSubArray(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            maxGlobal = Math.max(maxGlobal, maxCurrent);
        }
        
        return maxGlobal;
    }
    
    public static void main(String[] args) {
        MaximumSubarray solver = new MaximumSubarray();
        
        System.out.println("=== Maximum Subarray (Kadane's Algorithm) ===\n");
        
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.printf("Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]\n");
        System.out.printf("Output: %d (subarray [4, -1, 2, 1])\n\n", solver.maxSubArray(nums1));
        
        int[] nums2 = {-3, -1, -2};
        System.out.printf("Input: [-3, -1, -2]\n");
        System.out.printf("Output: %d (all negative, pick largest)\n", solver.maxSubArray(nums2));
    }
}
