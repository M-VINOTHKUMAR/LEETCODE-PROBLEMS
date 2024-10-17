class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lm=height[l];
        int rm=height[r];
        int wat=0;
        while(l<r)
        {
            if(lm<rm)
            {
                l++;
                lm=Math.max(lm,height[l]);
                 wat+=lm-height[l];
            }
            else{
                r--;
                rm=Math.max(rm,height[r]);
                 wat+=rm-height[r];
            }
        }
        return wat;
    }
}