class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int size=Integer.MAX_VALUE;
        int sum=0,left=0;
        for(int i=0;i<nums.length;i++)
        {
                sum+=nums[i];
               while(target<=sum)
               {
                  size=Math.min((i-left+1),size);
                  //System.out.println(size);
                  sum-=nums[left];
                   left++;   
               }
        }
      
          return size==Integer.MAX_VALUE?0:size;
    }
}