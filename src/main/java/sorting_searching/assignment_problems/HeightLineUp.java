package sorting_searching.assignment_problems;

import java.util.Arrays;

public class HeightLineUp {
    // Bubble sort with early exit. Prints the line after every sweep.
    static void lineUp(int[] heights) {
        int pass = 0;
        boolean swapped = true;
        while (swapped) {
            pass++;
            swapped = false;
            for (int j = 0; j < heights.length - 1 - (pass - 1); j++) {
                if (heights[j] > heights[j + 1]) {
                    int t = heights[j]; heights[j] = heights[j + 1]; heights[j + 1] = t;
                    swapped = true;
                }
            }
            System.out.println("Pass " + pass + ": " + Arrays.toString(heights));
        }
    }

    public static void main(String[] args) {
        lineUp(new int[]{4, 2, 5, 1});  // sample 1: Pass 4 is the no-swap sweep required by the rule (see README)
        System.out.println();
        lineUp(new int[]{1, 3, 2, 4});  // Pass 1: [1,2,3,4], Pass 2 (no swap)
        System.out.println();
        lineUp(new int[]{9, 7, 8});     // own test
    }
}
