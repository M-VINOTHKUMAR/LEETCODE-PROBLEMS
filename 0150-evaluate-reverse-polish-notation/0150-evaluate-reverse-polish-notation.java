class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        for(String v:tokens)
        {
           
            try
            {
                int val=Integer.parseInt(v);
                s.push(val);
            }
            catch(Exception e)
            {
                
                switch(v)
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