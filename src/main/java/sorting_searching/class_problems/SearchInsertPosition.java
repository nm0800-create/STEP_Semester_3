package sorting_searching.class_problems;

public class SearchInsertPosition {
    // Lower-bound binary search: O(log n) time, O(1) space
    static int searchInsertPosition(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsertPosition(nums, 5)); // 2
        System.out.println(searchInsertPosition(nums, 2)); // 1
        System.out.println(searchInsertPosition(nums, 7)); // own test: 4 (append)
    }
}
