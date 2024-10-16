class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int  i=0;i<n;i++)
        {
            if(m.containsKey(nums[i])){
                 if(k>=Math.abs(m.get(nums[i])-i)) return true;
                
              }
                 m.put(nums[i],i);
        }
        return false;
    }
}