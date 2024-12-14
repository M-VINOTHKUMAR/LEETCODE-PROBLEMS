class Solution {
    public void swap(int nums[],int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void reverse(int nums[],int i)
    {
        int j=nums.length-1;
        while(i<j)
        {
            int t=nums[i];
            nums[i++]=nums[j];
            nums[j--]=t;
        }
    } 
    public void nextPermutation(int[] nums) {
       int ind1=-1;
       int n=nums.length;
       for(int i=n-2;i>=0;i--)
       {
          if(nums[i]<nums[i+1])
          {
             ind1=i;
             break;
          }
       }
        if(ind1==-1)
        {
            reverse(nums,0);
        }else{
            for(int i=n-1;i>=0;i--)
            {
                if(nums[ind1]<nums[i])
                {
                    swap(nums,ind1,i);
                    reverse(nums,ind1+1);
                    break;
                }
            }
        }
    }
}