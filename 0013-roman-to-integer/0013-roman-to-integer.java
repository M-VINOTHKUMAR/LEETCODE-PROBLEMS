class Solution {
    public int romanToInt(String s) {
          int a=0;
        HashMap<Character,Integer> m=new HashMap<>();
        m.put('I',1);m.put('V',5);m.put('X',10);m.put('L',50);
        m.put('C',100);m.put('D',500);m.put('M',1000);
        for(int i=0;i<s.length();i++)
        {
             if (i + 1 < s.length() && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
               a-= m.get(s.charAt(i));
            } else {
                a += m.get(s.charAt(i));
            }
        }return a;
    }
}