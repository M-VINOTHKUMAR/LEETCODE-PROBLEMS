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
        int size = 2;
        int maxsize = Math.min(n, m);
        int i = n - 2, j = 0;
        
        while (j < m) {
           int length =Math.min(n - i, m - j);
            int[] a = new int[length];
            int k = 0;
            int tempI = i, tempJ = j;
            
            // Collect elements along the diagonal
            while (tempI < n && tempJ < m && k < length) {
                a[k++] = mat[tempI++][tempJ++];
            }
            
            // Sort the collected diagonal elements
            Arrays.sort(a);
            
            // Re-assign sorted elements back to the matrix
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
            
            if (size == maxsize && n != m) {
                maxsize = -1;
            } else {
                if (maxsize != -1) {
                    size++;
                } else {
                    size--;
                }
            }
        }
        
        return mat;
    }
}
