class Solution {
    public boolean isIsomorphic(String s, String t) {
        int slen=s.length(),tlen=t.length();
        if(slen!=tlen)
          return false;
        HashMap<Character,Character> m=new HashMap<>();
        for(int i=0;i<slen;i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(!m.containsKey(c1))
              m.put(c1,c2);
            else if(m.get(c1)!=c2)
              return false;
        }
        return true;
    }
}