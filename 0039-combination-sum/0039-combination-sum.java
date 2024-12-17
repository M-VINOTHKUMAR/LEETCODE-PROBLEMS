class Solution {
     List<List<Integer>> l=new ArrayList<>();
     public void bt(int a[],int tar,int sum,List<Integer> il,int len)
     {
         if(sum==tar)
         {
            Collections.sort(il);
            if(!l.contains(il))
            l.add(il);
            return ;
         }
         for(int i=0;i<len;i++)
         {
            if(sum+a[i]<=tar)
            {
                sum+=a[i];
                il.add(a[i]);
                bt(a,tar,sum,new ArrayList<>(il),len);
                sum-=a[i];
                il.remove(il.size()-1);
            }
         }
     }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        bt(candidates,target,0,new ArrayList<>(),candidates.length);
        return l;
    }
}