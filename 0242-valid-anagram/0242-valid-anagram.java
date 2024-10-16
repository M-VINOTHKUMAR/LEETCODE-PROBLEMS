class Solution {
    public boolean isAnagram(String s, String t) {
       int a[]=new int[26];
       //int b[]=new int[27];
       Arrays.fill(a,0);
       //Arrays.fill(b,0);
       if(s.length()!=t.length()) return false;
        for( int i=0;i<s.length();i++)
        {
        int c=s.charAt(i)-97;// a=97 z=122;
         a[c]++;
        c=t.charAt(i)-97;
         a[c]--;
       }
        for(int i=0;i<26;i++)
        {
            if(a[i]!=0)
                return false;
        }
        return true;
    }
}