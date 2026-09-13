package arrays_advanced.assignment_problems;

import java.util.HashMap;

public class SubarraySumEqualsK {
    
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); // Base case: empty prefix
        
        int currentSum = 0;
        int count = 0;
        
        for (int num : nums) {
            currentSum += num;
            
            // Check if (currentSum - k) exists in map
            if (prefixSumCount.containsKey(currentSum - k)) {
                count += prefixSumCount.get(currentSum - k);
            }
            
            // Add current prefix sum to map
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        SubarraySumEqualsK solver = new SubarraySumEqualsK();
        
        System.out.println("=== Subarray Sum Equals K ===\n");
        
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.printf("Input: [1, 1, 1], k=2\n");
        System.out.printf("Output: %d (subarrays [0-1] and [1-2])\n\n", solver.subarraySum(nums1, k1));
        
        int[] nums2 = {1, -1, 0};
        int k2 = 0;
        System.out.printf("Input: [1, -1, 0], k=0\n");
        System.out.printf("Output: %d\n", solver.subarraySum(nums2, k2));
    }
}
