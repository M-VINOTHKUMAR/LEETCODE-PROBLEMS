class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if(s.length()==0) return true;
        StringBuilder sb=new StringBuilder();
        while(i<t.length() && j<s.length())
        {
            if(s.charAt(j)==t.charAt(i))
            {
                  sb.append(s.charAt(j));
                  j++;
            }
            i++;
        }
        return sb.toString().equals(s);
    }
}