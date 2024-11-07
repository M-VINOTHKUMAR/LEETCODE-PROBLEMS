import java.util.Arrays;

class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        if(n==1)
        {
        // Arrays.sort(mat[0]);
         return mat;
        }
        int m = mat[0].length;
        int i = n - 2, j = 0;
        
        while (j < m) {
           int length =Math.min(n - i, m - j);
            int[] a = new int[length];
            int k = 0;
            int tempI = i, tempJ = j;
            
           
            while (tempI < n && tempJ < m && k < length) {
                a[k++] = mat[tempI++][tempJ++];
            }
            
            Arrays.sort(a);
            
            
            tempI = i;
            tempJ = j;
            k = 0;
            while (tempI < n && tempJ < m && k <length) {
                mat[tempI++][tempJ++] = a[k++];
            }
            
            if (i == 0) {
                j++;
            } else {
                i--;
            }
        }
        
        return mat;
    }
}
