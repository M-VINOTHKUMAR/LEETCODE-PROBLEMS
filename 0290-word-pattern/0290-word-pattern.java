class Solution {
    public boolean wordPattern(String pattern, String s) {
        String a[]=s.split(" ");
      //  System.out.print(a.length);
        int n=pattern.length();
       if(pattern.length()!=a.length) return false;
        HashMap<Character,String> m=new   HashMap<>();
        m.put(pattern.charAt(0),a[0]);
        for(int i=1;i<n;i++)
        {
            if(!m.containsKey(pattern.charAt(i)) && !m.containsValue(a[i]))
            {
                  m.put(pattern.charAt(i),a[i]);
            }
            else
            {
                String c=m.get(pattern.charAt(i));
               //  System.out.print(m);
                if(!a[i].equals(c))
                {
                          return false;
                }
            }
        }
        return true;
        
    }
}