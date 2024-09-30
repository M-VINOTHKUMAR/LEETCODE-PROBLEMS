class Solution {
    public String decodeString(String s) {
        Stack<String > str=new Stack<>();
        Stack<Integer> d=new Stack<>();
       
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            StringBuilder res=new StringBuilder("");
            if(c==']')
            {
            while(!str.peek().equals("["))
            {
                res.insert(0,str.pop());
            }
            int key=d.pop();
             String temp="";
             for(int j=0;j<key;j++)
             {
               temp+=(res.toString());
             }
             str.pop();
             str.push(temp);
            }
           else  if(Character.isDigit(c))
            {
                int repdig=0;
                while(Character.isDigit(s.charAt(i)))
                {
                     repdig=repdig*10+(s.charAt(i)-48);
                     i++;
                }
                d.push(repdig);
                i--;
            }else
        {
            str.push(String.valueOf(c));
        }
      //  System.out.println(str+" "+d);
        }
         StringBuilder res=new StringBuilder("");
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