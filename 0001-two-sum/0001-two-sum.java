class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int remaining_value=target-nums[i];
            if(m.containsKey(remaining_value))
            {
                return new int[]{ m.get(remaining_value),i};
            }
            m.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}