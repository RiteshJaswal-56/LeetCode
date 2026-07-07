class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int n = prices.length;
        int profit = 0;
        for(int i=1;i<n;i++){
            if(prices[i] < buyprice){
                buyprice = prices[i];
            }
            else{
                int currentprofit = prices[i] - buyprice;
                profit = Math.max(profit , currentprofit);
            }
        }
        return profit;
    }
}