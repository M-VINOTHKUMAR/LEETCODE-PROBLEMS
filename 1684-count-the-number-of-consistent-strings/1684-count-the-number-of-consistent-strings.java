class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      int c=0;
        for(int i=0;i<words.length;i++)
        {
            int f=0;
            for(int j=0;j<words[i].length();j++)
            {
              if( allowed.contains(String.valueOf(words[i].charAt(j))))
              {
             f++;
              }
            }
            if(f==words[i].length())
            c++;
        }
        return c;
    }
}