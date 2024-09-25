class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
          return 0;
          int maxsize=Integer.MIN_VALUE;
        List<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(l.contains(c))
            {
                int j=0;
              //  System.out.println("in"+l);
                while(j<l.size() && l.contains(c))
                {
                     
                   l.remove(j);
                }
                //System.out.println("end"+l);
                l.add(c);
            }
            else{
                l.add(c);
                maxsize=Math.max(maxsize,l.size());
            }
           
        }
        return maxsize;
    }
}