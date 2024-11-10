class Solution {
    public boolean isIsomorphic(String s1, String s2) {
        int l1=s1.length();
		int l2=s2.length();
		int a[]=new int[128];
		int b[]=new int[128];
		if(l1!=l2)
		       return false ;
		  Arrays.fill(a,-1);
          Arrays.fill(b,-1);
		for(int i=0;i<l1;i++)
		{
            int p1=s1.charAt(i);
            int p2=s2.charAt(i);
            if(a[p1]!=-1 && a[p1]!=p2)
              return false;
            else if(b[p2]!=-1 && b[p2]!=p1)
              return false;
            a[p1]=p2;
            b[p2]=p1;
		}
		 return true;
    }
}