class Solution {
    public int[] xorQueries(int[] arr, int[][] q) {
       int a[]=new int[q.length];
       for(int i=0;i<q.length;i++)
       {
           int x=0;
          for(int j=q[i][0];j<=q[i][1];j++)
          {
            x^=arr[j];
          }
          a[i]=x;
       } 
       return a;
    }
}