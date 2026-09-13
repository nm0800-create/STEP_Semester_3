package arrays_advanced.assignment_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    
    public int[][] threeSum(int[] nums) {
        Arrays.sort(nums);
        List<int[]> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];
            
            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    result.add(new int[]{nums[i], nums[left], nums[right]});
                    
                    // Skip duplicates for left pointer
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    // Skip duplicates for right pointer
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        return result.toArray(new int[result.size()][]);
    }
    
    public static void main(String[] args) {
        ThreeSum solver = new ThreeSum();
        
        System.out.println("=== 3Sum ===\n");
        
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        int[][] result1 = solver.threeSum(nums1);
        System.out.println("Input: [-1, 0, 1, 2, -1, -4]");
        System.out.println("Output:");
        for (int[] triplet : result1) {
            System.out.println(Arrays.toString(triplet));
        }
        System.out.println();
        
        int[] nums2 = {0, 0, 0};
        int[][] result2 = solver.threeSum(nums2);
        System.out.println("Input: [0, 0, 0]");
        System.out.println("Output:");
        for (int[] triplet : result2) {
            System.out.println(Arrays.toString(triplet));
        }
    }
}
