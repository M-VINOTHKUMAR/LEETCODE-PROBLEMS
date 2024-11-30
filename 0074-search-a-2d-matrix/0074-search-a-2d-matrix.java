class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,j=matrix.length-1;
        while(i<=j)
        {
            int m=i+(j-i)/2;
            int len=matrix[m].length-1;
            if(target>=matrix[m][0] && target<=matrix[m][len])
            {
               // System.out.println(0);
                int s=0,e=len;
                while(s<=e)
                {
                    int mid=s+(e-s)/2;
                   // System.out.println(matrix[m][mid]);
                    if(matrix[m][mid]==target)
                       return true;
                    else if(matrix[m][mid]<target)
                        s=mid+1;
                    else
                       e=mid-1;
                }
                break;

            }else if(target<=matrix[m][len])
               j=m-1;
               else
               i=m+1;
        }
        return false;
    }
}