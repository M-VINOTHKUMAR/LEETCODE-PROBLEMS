class Solution {
    public int[] asteroidCollision(int[] a) {
    int n=a.length;
    Stack<Integer> s=new Stack<>();
    int i=0;
    while(i<n && a[i]<0)
    {
          s.push(a[i++]);
    }
    boolean b=false;
     while(i<n)
     {
        System.out.println(s);
        while(!s.isEmpty() && s.peek()>0 && a[i]<0)
        {
            if((a[i]*-1)>s.peek())
            {
              s.pop();
            }
            else if((a[i]*-1)<=s.peek())
            {
                if((a[i]*-1)==s.peek())
                {
                s.pop();
                }
                b=true;
               break;
            }
        }
            s.push(a[i]);
            if(b)
             s.pop();
        System.out.println(s);
        i++;
     }
     i=0;
     int res[]=new int[s.size()];
     while(!s.isEmpty())
     {
        res[i++]=s.pop();
     }
     int j=res.length-1;
     i=0;
     while(i<j)
     {
        int t=res[i];
        res[i++]=res[j];
        res[j--]=t;
     }
     return res;
    }
}