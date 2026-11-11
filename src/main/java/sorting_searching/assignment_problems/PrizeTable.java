package sorting_searching.assignment_problems;

import java.util.Arrays;

public class PrizeTable {
    // Selection sort, descending. Counts only real swaps.
    static int prizeTable(int[] marks) {
        int swaps = 0;
        for (int i = 0; i < marks.length - 1; i++) {
            int best = i;
            for (int j = i + 1; j < marks.length; j++) {
                if (marks[j] > marks[best]) best = j;
            }
            if (best != i) {
                int t = marks[i]; marks[i] = marks[best]; marks[best] = t;
                swaps++;
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        int[] a = {45, 90, 60, 75};
        int s1 = prizeTable(a);
        System.out.println(Arrays.toString(a) + " swaps = " + s1); // [90, 75, 60, 45] swaps = 2
        int[] b = {80, 70, 60};
        int s2 = prizeTable(b);
        System.out.println(Arrays.toString(b) + " swaps = " + s2); // [80, 70, 60] swaps = 0
        int[] c = {10, 40, 20, 30};
        int s3 = prizeTable(c);
        System.out.println(Arrays.toString(c) + " swaps = " + s3); // own test
    }
}
