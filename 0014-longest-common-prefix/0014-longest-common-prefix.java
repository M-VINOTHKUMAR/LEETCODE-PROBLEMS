class Solution {
    public String longestCommonPrefix(String[] strs) {
          int n=strs.length;
          if(n==0) return "";
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder(strs[0]);
        for(int i=1;i<n;i++)
        {
           for(int j=0;j<sb.length();j++)
           {
             if(sb.charAt(j)!=strs[i].charAt(j))
               {
                  sb.delete(j,sb.length());
                  break;
               }
           }
           if(sb.toString().equals("") )return "";
         }
         return sb.toString();
    }
}