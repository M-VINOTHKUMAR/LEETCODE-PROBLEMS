class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>> m=new HashMap<>();
    for(String s:strs)
    {
        char[] c=s.toCharArray();
        Arrays.sort(c);
        String st=new String(c);
        m.putIfAbsent(st,new ArrayList<>());
        m.get(st).add(s);
    }
    System.out.println(m);
    return new ArrayList<>(m.values());

    }
}