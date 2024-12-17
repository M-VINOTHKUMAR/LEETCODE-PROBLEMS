class Solution {
    public int firstMissingPositive(int[] nums) {
       int i=0,n=nums.length;
       //tryy-->[1,2,3,12]--->make this array
       while(i<n)
       {
          int loc=nums[i]-1;
          if(nums[i]>0 && nums[i]<n && nums[loc]!=nums[i])
          {
             int t=nums[i];
             nums[i]=nums[loc];
             nums[loc]=t;
          }else
             i++;
       }
       i=0;
       while(i<n)
       {
          if(nums[i]-1!=i)
             return i+1;
             i++;
       }
       return n+1;
    }
}