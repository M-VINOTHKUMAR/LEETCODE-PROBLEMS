class Solution {
    public int rec(int coin[],int sum,int i,int n,int dp[][])
    {
        if(sum==0)
                return 1;
        if(sum<0 || i>=n)
             return 0;
        if(dp[i][sum] != -1)
           return dp[i][sum];
        int includecoin=rec(coin,sum-coin[i],i,n,dp);
        int execludecoin=rec(coin,sum,i+1,n,dp);
       
        return  dp[i][sum]=includecoin+execludecoin;
    }
   
    public int change(int sum, int[] coins) {
     int dp[][]=new int[coins.length][sum+1];
      if(sum ==0)
            return 1;
       for(int i=0;i<coins.length;i++)
         Arrays.fill(dp[i],-1);
        int n=rec(coins,sum,0,coins.length,dp);
        return n; 
    }
}