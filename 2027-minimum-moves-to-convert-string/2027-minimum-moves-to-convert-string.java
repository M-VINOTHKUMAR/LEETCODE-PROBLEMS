class Solution {
    public int minimumMoves(String s) {
        int i=0;
        int n=s.length();
        int m1=0,m2=0;
        while(i<n)
        {
            if(s.charAt(i)=='X')
            {
                i+=3;
                m1++;
            }else{
                i++;
            }
        }
        return m1;
    }
}