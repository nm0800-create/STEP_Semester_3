package sorting_searching.class_problems;

public class BestSingleTradeProfit {
    // One pass: O(n) time, O(1) space
    static int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE, best = 0;
        for (int p : prices) {
            if (p < minSoFar) minSoFar = p;
            else best = Math.max(best, p - minSoFar);
        }
        return best;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4})); // 5
        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));    // 0
        System.out.println(maxProfit(new int[]{2, 4, 1}));          // own test: 2
    }
}
