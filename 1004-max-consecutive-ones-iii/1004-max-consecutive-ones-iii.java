class Solution {
    public int longestOnes(int[] nums, int k) {
       int left=0;
       int right=0;
       int max=0;
       int zc=0;
       while(right<nums.length)
       {
         if(nums[right]==0)
            zc++;
          while(zc>k)
          {
              if(nums[left]==0)
                zc--;
                left++;
          }
           max=Math.max(max,right-left+1);
           right++;
       }
       return max;
    }
}