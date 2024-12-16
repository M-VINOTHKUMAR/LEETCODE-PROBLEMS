class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int i=0,j=n-1;
        while(i<=j)
        {
            int mid=(i+j)/2;
            if(nums[mid]==target)
            {
                int start=mid,end=mid;
                while(start-1>=0 && nums[start-1]==target)
                {
                    start--;
                }
               while(end+1<n && nums[end+1]==target)
                {
                    end++;
                }
                return new int[]{start,end};
                
            }else if(nums[mid]>target)
            {
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}