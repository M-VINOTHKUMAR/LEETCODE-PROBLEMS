class Solution {
    public boolean rec(String s1,String s2,String s3,int i,int j, int k,Boolean dp[][])
    {
        if(k==-1 && i==-1 && j==-1)
           return true;
        if(k==-1)
            return false;
        if(dp[i+1][j+1]  !=(null))
            return dp[i+1][j+1];
            boolean a=i!=-1 && s1.charAt(i)==s3.charAt(k) &&rec(s1,s2,s3,i-1,j,k-1,dp);
            boolean b=j!=-1 && s2.charAt(j)==s3.charAt(k) &&rec(s1,s2,s3,i,j-1,k-1,dp);
          return dp[i+1][j+1]=a||b;
      
    }
    public boolean isInterleave(String s1, String s2, String s3) {
       int i=0;int j=0;int k=0;
       int l1=s1.length(),l2=s2.length(),l3=s3.length();
       if(l1+l2!=l3)
         return false;
        Boolean dp[][]=new Boolean[l1+1][l2+1];
      return rec(s1,s2,s3,l1-1,l2-1,l3-1,dp);
    }
}