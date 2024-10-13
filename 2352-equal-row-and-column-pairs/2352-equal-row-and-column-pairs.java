class Solution {
    public int equalPairs(int[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            int b[]=grid[i];
            for(int j=0;j<grid[0].length;j++)
            {
                int len=0;
                 for(int k=0;k<grid.length;k++)
                 {
                    if(b[k]==grid[k][j])
                      len++;
                      else
                       break;
                 }
                 if(len==b.length)
                 {
                    c++;
                 }
            }
        }
        return c;
    }
}