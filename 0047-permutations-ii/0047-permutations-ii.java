class Solution {
    public void perm(List<List<Integer>> li,int a[],int n,List<Integer> l,boolean b[],int i)
    {
        if(l.size()==n)
        {
          //  System.out.println(l+" "+i);
            li.add(new ArrayList<>(l));
        }else{
            for(int j=0;j<n;j++)
            {
                if(b[j] || j>0 && a[j-1]==a[j] && !b[j-1])
                   continue;
                b[j]=true;
                l.add(a[j]);
                perm(li,a,n,l,b,j+1);
                b[j]=false;
                l.remove(l.size()-1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Arrays.sort(nums);
        perm(l,nums,nums.length,new ArrayList<>(),new boolean[nums.length],0);
        return l;
    }
}