package arrays_advanced.assignment_problems;

import java.util.Arrays;

public class ProductExceptSelf {
    
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // First pass: compute prefix products (product of all elements to the left)
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Second pass: multiply by suffix products (product of all elements to the right)
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;
            suffix *= nums[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        ProductExceptSelf solver = new ProductExceptSelf();
        
        System.out.println("=== Product of Array Except Self ===\n");
        
        int[] nums1 = {1, 2, 3, 4};
        int[] result1 = solver.productExceptSelf(nums1);
        System.out.printf("Input: [1, 2, 3, 4]\nOutput: %s\n\n", Arrays.toString(result1));
        
        int[] nums2 = {-1, 1, 0, -3, 3};
        int[] result2 = solver.productExceptSelf(nums2);
        System.out.printf("Input: [-1, 1, 0, -3, 3]\nOutput: %s\n", Arrays.toString(result2));
    }
}
