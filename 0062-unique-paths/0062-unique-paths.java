class Solution {
    public int uniquePaths(int m, int n) {
        int a[][]=new int[m][n];
     return up(m-1,n-1,a);
    }
    public int up(int i,int j,int a[][])
    {
        if(i==0 && j==0)
           return a[i][j]=1;
        else if(i==-1 || j==-1)
          return 0;
        else if(a[i][j]!=0)
           return a[i][j];
        else
          return a[i][j]=up(i-1,j,a)+up(i,j-1,a);
    }
}