class Solution {
     List<List<Integer>> l=new ArrayList<>();
     public void rec(int nums[],int n,List<Integer> t,int vis[])
     {
        if(t.size()==n)
        {
            if(!l.contains(t))
            {
                l.add(new ArrayList<>(t));
            }
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(vis[i]!=-1)
            {
            t.add(nums[i]);
             vis[i]=-1;
             rec(nums,n,t,vis);
             vis[i]=0;
             t.remove(t.size()-1);
            }
        }
     }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int n=nums.length;
        int v[]=new int[n];
        List<Integer> t=new ArrayList<>();
        rec(nums,n,t,v);
        return l;
        
    }
}