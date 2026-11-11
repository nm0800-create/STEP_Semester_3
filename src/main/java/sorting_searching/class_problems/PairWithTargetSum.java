package sorting_searching.class_problems;

import java.util.HashSet;

public class PairWithTargetSum {
    // Hash set: O(n) average time, O(n) space
    static boolean hasPairWithSum(int[] nums, int target) {
        HashSet<Integer> seen = new HashSet<>();
        for (int x : nums) {
            if (seen.contains(target - x)) return true; // complement seen at an earlier index
            seen.add(x);
        }
        return false;
    }

    // Brute force: O(n^2) time, O(1) space
    static boolean hasPairWithSumBrute(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasPairWithSum(new int[]{2, 7, 11, 15}, 9)); // true
        System.out.println(hasPairWithSum(new int[]{3, 4, 6}, 20));     // false
        System.out.println(hasPairWithSumBrute(new int[]{3, 3}, 6));    // own test: true (distinct indices)
    }
}
