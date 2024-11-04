class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int a[][]=new int[n+1][2];
        for(int i=0;i<n;i++)
        {
            a[i]=intervals[i];
        }
        a[n]=newInterval;
        Arrays.sort(a,(b,c)->Integer.compare(b[0],c[0]));
          int pos=-1;
        for(int i=1;i<n+1;i++)
        {
           int temp[]=a[i-1];
         
           if( pos==-1 && temp[0]<=a[i][0] && temp[1]>=a[i][0])
           {
               if(temp[1]<a[i][1])
               {
                 a[i-1][1]=a[i][1];
                 a[i][0]=-1;
                 a[i][1]=-1;
                 pos=i-1;
               }
                else
            {
               a[i][0]=-1;a[i][1]=-1;
               pos=i-1;
            }
           }
           else if(pos!=-1 && a[pos][1]>=a[i][0] )
           { 
            
            if(a[pos][1]<a[i][1])
            {
            
              a[pos][1]=a[i][1];
              a[i][0]=-1;a[i][1]=-1;
            }
            else
            {
               a[i][0]=-1;a[i][1]=0-1;
            }
           }
           //System.out.println(Arrays.deepToString(a));
            
        }
        int c=0;
        for(int i=0;i<n+1;i++)
        {
            if(a[i][0]!=-1 && a[i][1]!=-1)
             c++;
        }
        int res[][]=new int[c][2];
        c=0;
        for(int i=0;i<n+1;i++)
        {
            if(a[i][0]!=-1 && a[i][1]!=-1)
                res[c++]=a[i];
        }
         return res;
    }
}