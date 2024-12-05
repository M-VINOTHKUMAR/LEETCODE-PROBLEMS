class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            profit=Math.max(profit,prices[i]-buy);
           if(buy>prices[i])
           {
            buy=prices[i];
           }
       }
       return profit;
    }
}