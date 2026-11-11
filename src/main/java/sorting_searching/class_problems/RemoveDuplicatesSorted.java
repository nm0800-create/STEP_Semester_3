package sorting_searching.class_problems;

import java.util.Arrays;

public class RemoveDuplicatesSorted {
    // In-place two pointers: O(n) time, O(1) additional space
    static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int w = 1; // next write position for a unique value
        for (int r = 1; r < nums.length; r++) {
            if (nums[r] != nums[w - 1]) {
                nums[w++] = nums[r];
            }
        }
        return w;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int len = removeDuplicates(nums);
        System.out.println("length = " + len); // 5
        System.out.println("nums[0.." + (len - 1) + "] = " + Arrays.toString(Arrays.copyOf(nums, len))); // [1, 2, 3, 4, 5]
    }
}
