package arrays_advanced.class_problems;

public class BestTimeToTrade {
    
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }
        
        return maxProfit;
    }
    
    public static void main(String[] args) {
        BestTimeToTrade trader = new BestTimeToTrade();
        
        System.out.println("=== Best Time to Buy and Sell Stock ===\n");
        
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.printf("Input: [7, 1, 5, 3, 6, 4]\nOutput: %d (Buy at 1, sell at 6)\n\n", 
                         trader.maxProfit(prices1));
        
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.printf("Input: [7, 6, 4, 3, 1]\nOutput: %d (Prices only fall)\n", 
                         trader.maxProfit(prices2));
    }
}
