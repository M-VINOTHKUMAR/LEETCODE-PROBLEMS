class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        int mid[]=intervals[0];
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(mid[1]>=intervals[i][0] )
            {
                if(mid[1]<=intervals[i][1])
                mid[1]=intervals[i][1];
                intervals[i][0]=-1;
                intervals[i][1]=-1;
                count++;
            }else{
                mid=intervals[i];
            }
        }
       // return intervals;
        int res[][]=new int[n-count][2];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(intervals[i][0]!=-1)
               res[j++]=intervals[i];
        }
        return res;
        
    }
}