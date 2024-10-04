class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        int n=og.length;
        int m=og[0].length;
        int dp[][]=new int[n][m];
        if(og[0][0]==1)
           return 0;
        dp[0][0]=1;
        for(int i=1;i<n;i++)
        {
            if(og[0][i]==1 || dp[0][i-1]==0)
                   dp[0][i]=0;
            else
              dp[0][i]=1;
        } 
        for(int i=1;i<m;i++)
        {
            if(og[i][0]==1 || dp[i-1][0]==0)
                   dp[i][0]=0;
            else
              dp[i][0]=1;
        }
         for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(og[i][j]!=1)
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
          
        }
          // int val=upwithobs(obstacleGrid,dp,n-1,m-1,n-1,m-1);
      //  System.out.println(Arrays.deepToString(dp));
        return dp[n-1][m-1];

    }
}