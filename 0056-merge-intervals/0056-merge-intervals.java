class Solution {
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
        int m=2;
        List<int[]> l=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
      // System.out.println(Arrays.deepToString(intervals));
      int a[]=intervals[0];
      boolean b=false;
      for(int i=1;i<n;i++)
      {
         if(a[1]<intervals[i][0])
         {
          l.add(a);
            a=intervals[i];
         }
         else
         {
             if(a[1]<intervals[i][1])
                a[1]=intervals[i][1];
         }   
         //System.out.println(Arrays.toString(a));
      }
      l.add(a);
    
      int res[][]=new int[l.size()][2];
      for(int i=0;i<l.size();i++)
          res[i]=l.get(i);
        return res;
    }
}