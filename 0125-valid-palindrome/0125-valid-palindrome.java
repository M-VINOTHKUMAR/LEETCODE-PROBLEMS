class Solution {
    public boolean isPalindrome(String s) {
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>64 && c<91) // capital letter
            {
               t+=(char)(c+32);
            }
            else if((c>96 && c<123)|| (c>46 && c<58)){ // small letter
               t+=(char)c;
        }
       
    }
    // System.out.println(t);
    int i=0,j=t.length()-1;
    while(i<=j)
    {
        if(t.charAt(i)!=t.charAt(j))
           return false;
           i++;
           j--;
    }
     return true;
}
}