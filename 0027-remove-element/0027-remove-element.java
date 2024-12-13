class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
         int i=0,j=n-1;
        while(i<n)
        {
          if(nums[i]==val)
          {
            while(j>i)
            {
                if(nums[j]!=val)
                {
                    int t=nums[i];
                    nums[i]=nums[j];
                    nums[j]=t;
                    break;
                }
                j--;
            }
          }
          i++;
        }
        for( i=0;i<n;i++)
        {
            if(nums[i]==val)
               return i;
        }
        return i;
    }
}