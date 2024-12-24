class Solution {
    public int rec(int n,int dp[])
    {
       if(n==0)
        return dp[0]=1;
        if(n<0)
         return 0;
        if(dp[n]!=-1)
          return dp[n];
        else
          return dp[n]=rec(n-1,dp)+rec(n-2,dp);
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
         return rec(n,dp);
    }
}