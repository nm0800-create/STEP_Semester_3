package arrays_advanced.assignment_problems;

public class FindMinInRotatedArray {
    
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If middle element is greater than right, minimum is in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Minimum is in left half (including mid)
                right = mid;
            }
        }
        
        return nums[left];
    }
    
    public static void main(String[] args) {
        FindMinInRotatedArray finder = new FindMinInRotatedArray();
        
        System.out.println("=== Find Minimum in Rotated Sorted Array ===\n");
        
        int[] nums1 = {3, 4, 5, 1, 2};
        System.out.printf("Input: [3, 4, 5, 1, 2]\nOutput: %d\n\n", finder.findMin(nums1));
        
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        System.out.printf("Input: [4, 5, 6, 7, 0, 1, 2]\nOutput: %d\n\n", finder.findMin(nums2));
        
        int[] nums3 = {11, 13, 15, 17};
        System.out.printf("Input: [11, 13, 15, 17]\nOutput: %d (no rotation)\n", finder.findMin(nums3));
    }
}
