class Solution {
    public int longestValidParentheses(String s) {
        Stack<Character> t=new Stack();
        int v=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!t.isEmpty() && t.peek()=='(' && c==')')
                v+=2;
            if( v!=0 && (!t.isEmpty() && (t.peek()==')' && c==')') || (t.peek()=='(' && c=='(')))
              v=0;
              max=Math.max(v,max);
          t.push(c);   
        }
        return max;
    }
}