package sorting_searching.class_problems;

import java.util.Arrays;

public class SpiralOrderTraversal {
    // O(m * n) time; output space O(m * n), no extra space beyond output
    static int[] spiralOrder(int[][] grid) {
        if (grid.length == 0) return new int[0];
        int m = grid.length, n = grid[0].length;
        int[] out = new int[m * n];
        int k = 0, top = 0, bottom = m - 1, left = 0, right = n - 1;
        while (top <= bottom && left <= right) {
            for (int j = left; j <= right; j++) out[k++] = grid[top][j];
            top++;
            for (int i = top; i <= bottom; i++) out[k++] = grid[i][right];
            right--;
            if (top <= bottom) {
                for (int j = right; j >= left; j--) out[k++] = grid[bottom][j];
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) out[k++] = grid[i][left];
                left++;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(spiralOrder(grid))); // [1, 2, 3, 6, 9, 8, 7, 4, 5]
        int[][] wide = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        System.out.println(Arrays.toString(spiralOrder(wide))); // own test: [1, 2, 3, 4, 8, 7, 6, 5]
    }
}
