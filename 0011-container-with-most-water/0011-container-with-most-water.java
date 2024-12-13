class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
       while(i<j)
       {
          int minhei=height[i]<height[j]?height[i]:height[j];
          max=Math.max(max,minhei*(j-i));
          if(height[i]==minhei)
              i++;
          else
             j--;          
       }        
       return max;
  }
}