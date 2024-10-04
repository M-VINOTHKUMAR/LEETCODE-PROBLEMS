class Solution {
    public int uniquePaths(int m, int n) {
     int s=0;
     int a[][]=new int[m][n];
    for(int i=0;i<m;i++)
       Arrays.fill(a[i],1);
    for(int i=1;i<m;i++)
    {
        for(int j=1;j<n;j++)
        {
             a[i][j]=(a[i-1][j]+a[i][j-1]);
           
        }
    }
    return a[m-1][n-1];
    }
}