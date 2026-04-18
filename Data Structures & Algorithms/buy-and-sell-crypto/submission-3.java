// 3:39 - 3:44 - 
class Solution {
    public int maxProfit(int[] prices) {
        int[] perDayStats = new int[prices.length];
        perDayStats[0] = 0;
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int instantProfit = prices[i] - prices[i-1] + (perDayStats[i-1] > 0 ? perDayStats[i-1] : 0);
            perDayStats[i] = instantProfit;
            maxProfit = Math.max(instantProfit, maxProfit);
        }
        return maxProfit;
    }
}
