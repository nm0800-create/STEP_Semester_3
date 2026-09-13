package arrays_advanced.class_problems;

import java.util.Arrays;

public class RotateArray {
    
    public int[] rotateArray(int[] nums, int k) {
        k = k % nums.length;
        int[] result = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        RotateArray rotator = new RotateArray();
        
        System.out.println("=== Rotate Array ===\n");
        
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        int[] result1 = rotator.rotateArray(nums1, k1);
        System.out.printf("Input: [1,2,3,4,5,6,7], k=3\nOutput: %s\n\n", Arrays.toString(result1));
        
        int[] nums2 = {1, 2};
        int k2 = 3;
        int[] result2 = rotator.rotateArray(nums2, k2);
        System.out.printf("Input: [1,2], k=3\nOutput: %s (k %% 2 = 1)\n", Arrays.toString(result2));
    }
}
