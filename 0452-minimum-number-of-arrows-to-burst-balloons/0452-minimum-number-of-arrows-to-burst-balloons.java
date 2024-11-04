class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int end=points[0][1];
        int c=0;
        for(int i=1;i<n;i++)
        {
            if(points[i][0]<=end)
            {
                end=Math.min(end,points[i][1]);
            }else
            {
                end=points[i][1];
                c++;
            }
        }
        return c+1;
    }
}