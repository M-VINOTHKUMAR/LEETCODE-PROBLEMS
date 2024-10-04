class Solution {
    public void gameOfLife(int[][] board) {
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int c=poscount(board,i,j,n,m);
              //  System.out.println(i+" "+j+" "+c);
                if( board[i][j]==0 && c==3)
                  board[i][j]=2;
               else if(board[i][j]==1 && (c==2 || c==3))
                 board[i][j]=3;
                 // System.out.println(board[i][j]);
            }
           
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]>1)
                   board[i][j]=1;
                else
                   board[i][j]=0;
             }
        }
        
    }
    public int poscount(int b[][],int i,int j,int n,int m)
    {
        int c=0;
        if( i-1>=0 && b[i-1][j]%2==1) c++;
        if( j-1>=0 && b[i][j-1]%2==1)c++;
        if(i-1>=0 && j-1>=0 && b[i-1][j-1]%2==1) c++;
        if(i+1<n && b[i+1][j]%2==1) c++;
        if(j+1<m && b[i][j+1]%2==1)c++;
        if(i+1<n && j+1<m && b[i+1][j+1]%2==1) c++;
        if(i-1>=0 && j+1<m && b[i-1][j+1]%2==1)c++;
        if(i+1<n && j-1>=0 && b[i+1][j-1]%2==1)c++;
        return c;
    }
}