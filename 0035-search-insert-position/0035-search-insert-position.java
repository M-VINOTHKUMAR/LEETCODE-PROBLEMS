class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j)
        {
            int m=i+(j-i)/2;
            if(nums[m]==target)
               return m;
            else if(nums[m]<target)
               i=m+1;
            else
               j=m-1;
        }
        return i;
    }
}