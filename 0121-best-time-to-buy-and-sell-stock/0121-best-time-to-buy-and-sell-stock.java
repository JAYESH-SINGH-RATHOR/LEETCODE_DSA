class Solution {
    // public int maxProfit(int[] prices) {
    //   int n = prices.length;
    //   int buyprice = Integer.MAX_VALUE;
    //   int maxprofit = 0;
    //   for(int i = 0; i < n; i++){
    //     if(buyprice < prices[i]){
    //         int profit = prices[i] - buyprice;
    //         maxprofit = Math.max(maxprofit , profit);
    //     }else{
    //         buyprice = prices[i];
    //     }
    //   }
    //   return maxprofit;
    // }

    public int maxProfit(int[] prices) {
        int buyp = Integer.MAX_VALUE;
        int profit = 0;
        int n = prices.length;
        for(int i = 0; i < n; i++){
            buyp = Math.min(buyp , prices[i]);
            profit = Math.max(profit , prices[i] - buyp);
        }
        return profit;
    }
}
 