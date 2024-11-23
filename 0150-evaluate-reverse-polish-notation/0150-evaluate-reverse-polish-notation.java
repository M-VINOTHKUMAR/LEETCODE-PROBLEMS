class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<tokens.length;i++)
        {
           
            try
            {
                int val=Integer.parseInt(tokens[i]);
                s.push(val);
            }
            catch(Exception e)
            {
                String v=tokens[i];
                switch(tokens[i])
                {
                case "+":
                {
                    s.push(s.pop()+s.pop());
                    break;
                }
                case "-":
                {
                    s.push(-1*(s.pop()-s.pop()));
                    break;
                }
                case "*":
                {
                    s.push((s.pop()*s.pop()));
                    break;
                }
                default :
                {
                    int f=s.pop();
                    int l=s.pop();
                    s.push(l/f);
                }
                }
                }
            }
        
     //  System.out.println(s);
        return s.pop();
    }
}