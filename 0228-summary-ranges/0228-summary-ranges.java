class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n=nums.length;
        boolean b=false;
        List<String> res=new ArrayList<>();
        if(n==0) return res;
        int st=nums[0];
        for(int i=0;i<n-1;i++)
        {
        if(nums[i]+1!=nums[i+1])
        {
            if(st==nums[i])
            res.add(String.valueOf(st));
            else
            res.add(st+"->"+nums[i]);
            st=nums[i+1];
            if(n-2==i)
              b=true;
        }
        }
        if(st==nums[n-1])
            res.add(String.valueOf(st));
            else
            res.add(st+"->"+nums[n-1]);
          return res;
    }
}