class Solution {
    public boolean isHappy(int n) {
        int d=0;
        ArrayList<Integer> l=new ArrayList<>();
        while(d!=1)
        {
            int sum=0;
           while(n!=0)
           {
              int v=n%10;
              sum+=v*v;n/=10;
           }
           if(l.contains(sum)) return false;
           l.add(sum);
           d=sum;
           n=sum;
        }
        return true;
    }
}