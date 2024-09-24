class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> res=new ArrayList<>();
         for(int i=0;i<nums.length;i++)
         {
            if(i>0 && nums[i]==nums[i-1])
               continue;
            int j=i+1,k=nums.length-1;
            while(j<k)
            {
                int t=nums[i]+nums[j]+nums[k];
                if(t==0)
                {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                         while(j<k && nums[j]==nums[j+1])
                            j++;
                }
                if(t>0)
                 k--;
                else   
                  j++;
                 
            }
         }
         return res;
    }
}