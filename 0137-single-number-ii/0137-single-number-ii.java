class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            if(i==0 && nums[i+1]!=nums[i])
            return nums[i];
           else if(i!=0 && nums[i-1]!=nums[i] && nums[i+1]!=nums[i])
              return nums[i];
        }
        return nums[n-1];
    }
}