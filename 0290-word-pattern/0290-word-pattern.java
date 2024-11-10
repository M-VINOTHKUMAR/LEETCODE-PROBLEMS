class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[]=new String[27];
        String p[]=new String[27];
        String b[]=s.split(" ");
        int n1=pattern.length();
        int n2=b.length;
        if(n1!=n2)
           return false;
         Arrays.fill(a,"");
        for(int i=0;i<n1;i++)
        {
            int po=pattern.charAt(i)-97;
            if(!a[po].equals("") && !a[po].equals(b[i]) )
              return false;
            a[po]=b[i];
            for(int j=0;j<26;j++)
            {
                if(p[j]!=null && p[j].equals(b[i]) && j!=po)
                  return false;
            }
            p[po]=b[i];
        }   
        return true;
    }
}