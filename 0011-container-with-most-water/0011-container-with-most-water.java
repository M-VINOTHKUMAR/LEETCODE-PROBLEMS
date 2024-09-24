class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE;
        int i=0,j=height.length-1;
        while(i<j)
        {
            int min=Math.min(height[i],height[j]);
            max=Math.max(((j-i)*(min)), max);
            if(min==height[i])
              i++;
            else
             j--;
        }
        return max;
    }
}