class Solution {
    public int singleNonDuplicate(int[] nums) {
        int v=0;
        for(int i=0;i<nums.length;i++)
        {
            v^=nums[i];
        }
        return v;
    }
}