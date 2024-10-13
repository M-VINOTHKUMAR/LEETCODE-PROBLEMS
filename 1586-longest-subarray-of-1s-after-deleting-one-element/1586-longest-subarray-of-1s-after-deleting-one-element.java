class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int right=0;
        int zpos=-1;
        int zcout=0;
        int max=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            {
               zpos=right;zcout++;
            }
            while(zcout==2)
            {
               if(nums[left]==0)
                zcout--;
                left++;
            }
            max=Math.max(max,right-left);
            right++;
        }
        return max;
    }
}