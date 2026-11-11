package sorting_searching.assignment_problems;

import java.util.Arrays;

public class DiceSort {
    // Counting sort on values 1..6. Never compares two throws.
    static int[] diceSort(int[] rolls) {
        int[] count = new int[7];
        for (int r : rolls) count[r]++;

        StringBuilder sb = new StringBuilder("Counts:");
        for (int v = 1; v <= 6; v++) sb.append(' ').append(v).append(':').append(count[v]);
        System.out.println(sb);

        int[] sorted = new int[rolls.length];
        int k = 0;
        for (int v = 1; v <= 6; v++)
            for (int c = 0; c < count[v]; c++) sorted[k++] = v;
        return sorted;
    }

    public static void main(String[] args) {
        int[] s = diceSort(new int[]{4, 1, 6, 4, 2, 1, 4});
        System.out.println("Sorted: " + Arrays.toString(s)); // [1, 1, 2, 4, 4, 4, 6]
        int[] t = diceSort(new int[]{6, 6, 3});               // own test
        System.out.println("Sorted: " + Arrays.toString(t));
    }
}
