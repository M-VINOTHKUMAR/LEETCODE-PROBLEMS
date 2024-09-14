class Solution {
    public int longestSubarray(int[] nums) {
        int max=Integer.MIN_VALUE,count=0,store=0;
        for(int i=0;i<nums.length;i++)
        max=Math.max(max,nums[i]);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==max)
                  count++;
            else
                count=0;
            store=Math.max(store,count);
        }
        return store;
    }
}