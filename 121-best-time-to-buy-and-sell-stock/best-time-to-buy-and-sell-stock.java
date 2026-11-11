// class Solution {
//     public int maxProfit(int[] prices) {
//       int n = prices.length;
//       int buyprice = Integer.MAX_VALUE;
//       int profit = 0;
//       int maxprofit = Integer.MIN_VALUE;
//       for(int i = 0; i < n; i++){
//         buyprice = Math.min(prices[i] , buyprice);
//         System.out.print(" buyprice = " +  buyprice +"\n");
//         for(int j = i; j < n; j++){
//             if(buyprice < prices[j]){
//                 profit = Math.max(profit , prices[j] - buyprice);
//                 System.out.print(" profit = " +  profit);
//             }
//         }
//         maxprofit = Math.max(profit , maxprofit);
//       }
//       return maxprofit;
//     }
// }


// method -> 2 :- optimal solution 

class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE;
        int profit = 0;
        for(int e : prices){
            buyprice = Math.min(e , buyprice);
            profit = Math.max(profit , e - buyprice);
        }
        return profit;
    }
}