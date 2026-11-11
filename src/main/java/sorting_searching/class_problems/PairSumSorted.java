package sorting_searching.class_problems;

public class PairSumSorted {
    // Two pointers: O(n) time, O(1) space. Brute force would be O(n^2).
    static int[] pairSumSorted(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == target) return new int[]{nums[l], nums[r]};
            if (sum < target) l++;
            else r--;
        }
        return null; // Not Found
    }

    public static void main(String[] args) {
        int[] a = pairSumSorted(new int[]{-4, -1, 0, 3, 5, 9}, 4);
        System.out.println(a == null ? "Not Found" : "(" + a[0] + ", " + a[1] + ")"); // (-1, 5)
        System.out.println(pairSumSorted(new int[]{1, 2, 3}, 100) == null ? "Not Found" : "found"); // Not Found
    }
}
