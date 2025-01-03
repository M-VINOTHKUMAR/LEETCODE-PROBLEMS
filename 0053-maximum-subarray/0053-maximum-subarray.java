class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]+nums[i-1]>=nums[i])
            {
                nums[i]=nums[i]+nums[i-1];
            }
            max=Math.max(max,nums[i]);
        }
        return max;
    }
}