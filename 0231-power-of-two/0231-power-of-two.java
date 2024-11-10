class Solution {
    public boolean twopow(int n,long  p)
    {
        if(n<=p)
        {
            //System.out.println()
            if(n==p)
              return true;
            return false;
        }
        return twopow(n,p*2);
    }
    public boolean isPowerOfTwo(int n) {
        return twopow(n,1);
    }
}