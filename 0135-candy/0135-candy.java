class Solution {
    public int candy(int[] rate) {
        int n=rate.length;
        int l[]=new int[n];
        int r[]=new int[n];
        l[0]=1;r[n-1]=1;
        int sum=0;
        for(int i=1;i<n;i++)
        {
           if(rate[i-1]<rate[i])
            l[i]=l[i-1]+1;
            else
             l[i]=1;
        }
          for(int i=n-2;i>=0;i--)
        {
           if(rate[i+1]<rate[i])
           r[i]=r[i+1]+1;
           else
            r[i]=1;
        }
       for(int i=0;i<n;i++)
       {
         sum+=Math.max(l[i],r[i]);
       }
       return sum;
    }
}