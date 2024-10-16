class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l=new ArrayList<>();
        HashMap<String,List<String>> m=new HashMap<>();
        for(String s:strs)
        {
          char[] c=s.toCharArray();
          Arrays.sort(c);
          String str=new String(c);
          m.putIfAbsent(str,new ArrayList());
          m.get(str).add(s);
        }
        l.addAll(m.values());
        return l;
        
    }
}