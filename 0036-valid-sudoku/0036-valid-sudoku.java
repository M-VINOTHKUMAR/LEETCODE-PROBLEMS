class Solution {
    public boolean isValidSudoku(char[][] board) {
 
        for(int i=0;i<9;i++)
        {
         HashSet<Character> r=new HashSet<>();
         HashSet<Character> c=new HashSet<>();
          HashSet<Character> b=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                
                if( board[i][j]!='.' && !r.add(board[i][j]))
                     return false;
                      if( board[j][i]!='.' && !c.add(board[j][i]))
                     return false;
                     int ro= 3*(i/3)+j/3;
                     int co=3*(i%3)+j%3;
                      if( board[ro][co]!='.' && !b.add(board[ro][co]))
                     return false;
            }

        }
        return true;

    }
}       