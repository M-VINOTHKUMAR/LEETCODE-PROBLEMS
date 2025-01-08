class Solution {
    public String decodeString(String s) {
        Stack<String > str=new Stack<>();
        Stack<Integer> d=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            // if "[" occurs then 
            if(c==']')
            {
                // string is collected
                 StringBuilder res=new StringBuilder("");
                  while(!str.peek().equals("["))
                  {
                 res.insert(0,str.pop());
                 }
                  int key=d.pop();
                  String temp="";  
                  // repeat the string 
                for(int j=0;j<key;j++)
                {
                    temp+=(res.toString());
                }
             str.pop(); // pop the "["
             str.push(temp); // push the repeated  string 
            }
           else  if(Character.isDigit(c))
            {
                // create the digit 
                int repdig=0;
                while(Character.isDigit(s.charAt(i))) // more than one digit
                {
                     repdig=repdig*10+(s.charAt(i)-48);
                     i++;
                }
                d.push(repdig);
                i--;
            }
            else
             {
                // push the string into the string stack
            str.push(String.valueOf(c));
        
            }
        }
         StringBuilder res=new StringBuilder("");
         // collect the final string 
        while(!str.isEmpty())
        {
            if(!str.peek().equals("["))
            {
                res.insert(0,str.pop());
            }else{
                str.pop();
            }
        }
        return res.toString();
    }
}