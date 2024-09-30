class Solution {
    public String sortSentence(String s) {
        String s1[]=s.split(" ");
        String res[]=new String[s1.length];
        for(int i=0;i<s1.length;i++)
        {
            char ind=s1[i].charAt(s1[i].length()-1);
            res[ind-1-'0']=s1[i].substring(0,s1[i].length()-1);
        }
        StringBuilder sb=new StringBuilder();
        for(String d:res)
        {
            sb.append(d+" ");
        }
        return sb.toString().trim();
    }
}