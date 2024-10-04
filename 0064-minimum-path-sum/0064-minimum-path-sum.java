class Solution {
    public int min(int g[][],int dp[][],int n,int m)
    {
       // System.out.println(Arrays.deepToString(dp));
       if(n<0 || m<0)
        return Integer.MAX_VALUE;
        if(n==0 && m==0)
           return g[0][0];
        if(dp[n][m]!=-1)
         return dp[n][m];

        return dp[n][m]=g[n][m]+Math.min(min(g,dp,n-1,m),min(g,dp,n,m-1)); 
    } 
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int dp[][]=new int[n][m];
        for(int i=0;i<n;i++)
          Arrays.fill(dp[i],-1);
          int val= min(grid,dp,n-1,m-1);
          System.out.println(Arrays.deepToString(dp));
        return val;
    }
}