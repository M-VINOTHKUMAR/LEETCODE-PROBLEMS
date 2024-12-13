class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        int i=0;
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        while(i<n)
        {
            if(i>0 && nums[i-1]==nums[i])
            {
             i++;
             continue;
            }
              int j=i+1,k=n-1;
              while(j<k)
              {
                int tar=nums[i]+nums[j]+nums[k];
                 if(nums[i]+nums[j]+nums[k]==0)
                  {
                      List<Integer> t=new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                          l.add(t);
                          while(j<k && nums[j]==nums[j+1])
                             j++;
                  }
                  if(tar>0)
                    k--;
                   else
                    j++;
              }
            i++;
        }
        return l;
        
    }
}