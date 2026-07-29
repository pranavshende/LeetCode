class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int i = 0;
        int profit = 0;

        while (i + 1 < n) {
            // Walk down to the next valley
            while (i + 1 < n && prices[i] >= prices[i + 1]) i++;
            int valley = prices[i];

            // Walk up to the peak that follows
            while (i + 1 < n && prices[i] <= prices[i + 1]) i++;
            int peak = prices[i];

            profit += peak - valley;
        }

        return profit;
    }
}