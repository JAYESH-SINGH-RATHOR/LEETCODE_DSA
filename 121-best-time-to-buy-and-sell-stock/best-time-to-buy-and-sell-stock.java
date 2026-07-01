class Solution {
    public int maxProfit(int[] prices) {
        int buyp = Integer.MAX_VALUE;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            buyp = Math.min(buyp , prices[i]);
            profit = Math.max(profit , prices[i] - buyp);
        }
        return profit;
    }
}